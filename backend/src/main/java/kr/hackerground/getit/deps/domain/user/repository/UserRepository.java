package kr.hackerground.getit.deps.domain.user.repository;

import kr.hackerground.getit.deps.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
