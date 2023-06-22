package kr.hackerground.getit.deps.domain.user.controller;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import jakarta.servlet.http.HttpServletResponse;
<<<<<<< HEAD
>>>>>>> parent of 9f1c812 (Merge branch 'main' of github.com:hackersground-kr/httpsgithubcomhackersground-krGet-It)
=======
>>>>>>> parent of 9f1c812 (Merge branch 'main' of github.com:hackersground-kr/httpsgithubcomhackersground-krGet-It)
=======
import jakarta.servlet.http.HttpServletResponse;
import kr.hackerground.getit.deps.domain.user.dto.TokenDto;
>>>>>>> 9f1c812e027d68ef7199f053878e884cb1d0ed7e
import kr.hackerground.getit.deps.domain.user.dto.UserDto;
import kr.hackerground.getit.deps.domain.user.entity.User;
import kr.hackerground.getit.deps.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/api/user")
@RestController @RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public ResponseEntity<HttpStatus> create(@RequestBody UserDto.Request userDto){
        userService.create(userDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 9f1c812e027d68ef7199f053878e884cb1d0ed7e

    @GetMapping("/@me")
    public ResponseEntity<?> readMe(@AuthenticationPrincipal User user){
        UserDto.Response userDto = userService.read(user.getId());
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @PostMapping("/login")
<<<<<<< HEAD
    public ResponseEntity<HttpStatus> login(@RequestBody UserDto.Request userDto, HttpServletResponse servletResponse) {
        String userToken = userService.loginAndGetToken(userDto);

        servletResponse.addHeader("Set-Cookie", "SESSION_TOKEN=" + userToken);
        return new ResponseEntity<>(HttpStatus.OK);
    }

>>>>>>> parent of 9f1c812 (Merge branch 'main' of github.com:hackersground-kr/httpsgithubcomhackersground-krGet-It)
=======
    public ResponseEntity<TokenDto> login(@RequestBody UserDto.Request userDto, HttpServletResponse servletResponse) {
        String userToken = userService.loginAndGetToken(userDto);
        TokenDto tokenDto = new TokenDto();

        tokenDto.setToken(userToken);

        return new ResponseEntity<>(tokenDto, HttpStatus.OK);
    }

>>>>>>> 9f1c812e027d68ef7199f053878e884cb1d0ed7e
    //readOne
    @GetMapping("/{userId}")
    public ResponseEntity<?> read(@PathVariable(name = "userId") Long userId){
        UserDto.Response userDto = userService.read(userId);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
    //update
    @PutMapping("/{userId}")
    public ResponseEntity<HttpStatus> update(@PathVariable(name = "userId") Long userId, UserDto.Request userDto){
        userService.update(userId, userDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //delete
    @DeleteMapping("/{userId}")
    public ResponseEntity<HttpStatus> delete(@PathVariable(name = "userId")Long userId){
        userService.delete(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
