package kr.hackerground.getit.deps.domain.payment.repository;

import kr.hackerground.getit.deps.domain.payment.entity.Payment;
import kr.hackerground.getit.deps.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findAllByUser(User user);
}
