package kr.hackerground.getit.deps.domain.reservation.controller;

import kr.hackerground.getit.deps.domain.reservation.service.ReservationService;
import kr.hackerground.getit.deps.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reservation")
public class ReservationController {
    private final ReservationService reservationService;
    @PostMapping("/reservation/{carCenterId}")
    public ResponseEntity<HttpStatus> makeReservation(@PathVariable Long carCenterId, @AuthenticationPrincipal User user){
        reservationService.makeReservation(user.getId(), carCenterId);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/reservation/{carCenterId}")
    public ResponseEntity<HttpStatus> cancelReservation(@PathVariable Long carCenterId, @AuthenticationPrincipal User user){
        reservationService.cancelReservation(user.getId(), carCenterId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
