package kr.hackerground.getit.deps.domain.user.controller;

import kr.hackerground.getit.deps.domain.user.dto.UserDto;
import kr.hackerground.getit.deps.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    //readOne
    @GetMapping("/{userId}")
    public ResponseEntity<?> read(@PathVariable(name = "userId") Long userId){
        UserDto.Response userDto = userService.read(userId);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
    //update
    @PutMapping("/{userId}")
    public ResponseEntity<HttpStatus> update(@PathVariable(name = "userId")Long userId, UserDto.Request userDto){
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
