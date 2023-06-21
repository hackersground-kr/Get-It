package kr.hackerground.getit.deps.domain.reservation.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter @RequiredArgsConstructor
public enum RegistrationStatus {
    //예약됨, 취소됨, 노쇼, 사용완료
    REGEISTERED("예약"),
    CANCELED("취소"),
    NO_SHOW("노쇼"),
    COMPLETED("사용완료");
    private final String title;
}
