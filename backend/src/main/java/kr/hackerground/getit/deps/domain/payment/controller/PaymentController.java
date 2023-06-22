package kr.hackerground.getit.deps.domain.payment.controller;

import kr.hackerground.getit.deps.domain.payment.dto.PaymentDto;
import kr.hackerground.getit.deps.domain.payment.service.PaymentService;
import kr.hackerground.getit.deps.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;
    @PostMapping("/{carCenterId}")
    public ResponseEntity<HttpStatus> makePayment(@AuthenticationPrincipal User user, @PathVariable(name = "carCenterId") Long carCenterId, @RequestBody PaymentDto.Request paymentDto) {
        paymentService.makePayment(user.getId(), carCenterId, paymentDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<PaymentDto.Response>> getUsersPayments(@AuthenticationPrincipal User user){
        List<PaymentDto.Response> paymentList = paymentService.getUsersPayments(user.getId());
        return new ResponseEntity<>(paymentList, HttpStatus.OK);
    }
}
