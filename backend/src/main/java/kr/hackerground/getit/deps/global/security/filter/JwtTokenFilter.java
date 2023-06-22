package kr.hackerground.getit.deps.global.security.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.hackerground.getit.deps.domain.user.entity.User;
import kr.hackerground.getit.deps.domain.user.repository.UserRepository;
import kr.hackerground.getit.deps.global.security.service.JwtTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class JwtTokenFilter extends OncePerRequestFilter {
    @Autowired
    private JwtTokenService jwtTokenUtil;

    @Autowired
    private UserRepository userRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain)
            throws ServletException, IOException {
        // Get authorization header and validate
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            chain.doFilter(request, response);
            return;
        }

        Optional<Cookie> sessionToken = Arrays.stream(cookies)
                .filter(cookie -> cookie.getName().equals("SESSION_TOKEN"))
                .findFirst();

        if (sessionToken.isEmpty()) {
            chain.doFilter(request, response);
            return;
        }

        // Get jwt token and validate
        final String token = sessionToken.get().getValue().trim();
        if (!jwtTokenUtil.validate(token)) {
            chain.doFilter(request, response);
            return;
        }

        // Get user identity and set it on the spring security context
        User userDetails = userRepository
                .findById(jwtTokenUtil.getId(token))
                .orElse(null);

        UsernamePasswordAuthenticationToken
                authentication = new UsernamePasswordAuthenticationToken(
                userDetails, null
        );

        authentication.setDetails(
                new WebAuthenticationDetailsSource().buildDetails(request)
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(request, response);
    }

}