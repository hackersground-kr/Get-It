package kr.hackerground.getit.deps.domain.user.service;

import kr.hackerground.getit.deps.domain.user.dto.UserDto;
import kr.hackerground.getit.deps.domain.user.entity.User;
import kr.hackerground.getit.deps.domain.user.repository.UserRepository;
import kr.hackerground.getit.deps.global.error.excetion.CUserNotFoundException;
import kr.hackerground.getit.deps.global.error.excetion.CUserPasswordInvalidException;
import kr.hackerground.getit.deps.global.security.service.JwtTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final JwtTokenService jwtTokenService;

    public void create(UserDto.Request userDto){
        String plainPassword = userDto.getPassword();
        String encryptedPassword = BCrypt.hashpw(plainPassword, BCrypt.gensalt());

        userDto.setPassword(encryptedPassword);
        User user = new User(userDto);
        userRepository.save(user);
    }
    //readOne
    public UserDto.Response read(Long userId){
        return new UserDto.Response(userRepository.findById(userId).orElseThrow(CUserNotFoundException::new));
    }
    //update
    public void update(Long userId, UserDto.Request userDto){
        User user = userRepository.findById(userId).orElseThrow(CUserNotFoundException::new);
        String plainPassword = userDto.getPassword();
        String encryptedPassword = BCrypt.hashpw(plainPassword, BCrypt.gensalt());

        userDto.setPassword(encryptedPassword);
        user.update(userDto);
        userRepository.save(user);
    }
    //delete
    public void delete(Long userId){
        userRepository.deleteById(userId);
    }

    public String loginAndGetToken(UserDto.Request userDto) {
        User user = userRepository.findByLogin(userDto.getLogin()).orElseThrow(CUserNotFoundException::new);
        String bodyPassword = userDto.getPassword();
        String savedPassword = user.getPassword();

        if (!BCrypt.checkpw(bodyPassword, savedPassword)) {
           throw new CUserPasswordInvalidException("비밀번호가 틀렸습니다.");
        }

        return jwtTokenService.createToken(user.getId());
    }
}
