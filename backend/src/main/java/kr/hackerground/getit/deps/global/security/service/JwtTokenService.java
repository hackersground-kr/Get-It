package kr.hackerground.getit.deps.global.security.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.UUID;

@Component
public class JwtTokenService implements InitializingBean {
    @Value("${jwt.secret:}")
    private String secret;

    private Key key;

    @Override
    public void afterPropertiesSet () {
        this.key = secret.getBytes().length > 512
                ? Keys.hmacShaKeyFor(secret.getBytes())
                : Keys.secretKeyFor(SignatureAlgorithm.HS512);
    }

    public String createToken(Long userId){
        return Jwts.builder()
                .claim("id", userId)
                .signWith(key, SignatureAlgorithm.HS512)
                .compact();
    }

    public Long getId (String token) {
        Claims claims = Jwts
                .parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();

        return claims.get("id", Long.class);
    }

    public boolean validate (String token) {
        try{
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (Exception ignored) {}

        return false;
    }
}
