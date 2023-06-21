package kr.hackerground.getit.deps.domain.user.service;

import kr.hackerground.getit.deps.domain.user.dto.UserDto;
import kr.hackerground.getit.deps.domain.user.entity.User;
import kr.hackerground.getit.deps.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void create(UserDto.Request userDto){
        User user = new User(userDto);
        userRepository.save(user);
    }
    //readOne
    public UserDto.Response read(Long userId){
        return new UserDto.Response(userRepository.findById(userId).orElseThrow());
    }
    //update
    public void update(Long userId, UserDto.Request userDto){
        User user = userRepository.findById(userId).orElseThrow();
        user.update(userDto);
        userRepository.save(user);
    }
    //delete
    public void delete(Long userId){
        userRepository.deleteById(userId);
    }
}
