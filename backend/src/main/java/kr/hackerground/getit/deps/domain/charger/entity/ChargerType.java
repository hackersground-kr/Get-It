package kr.hackerground.getit.deps.domain.charger.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter @RequiredArgsConstructor
public enum ChargerType {
    DC_FAST("DC차데모"),
    AC_3("AC3상"),
    DC_COMBO("DC콤보"),
    FIVE_PIN("5핀");
    private final String title;

}
