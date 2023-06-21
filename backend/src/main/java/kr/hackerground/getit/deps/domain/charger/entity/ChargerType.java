package kr.hackerground.getit.deps.domain.charger.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter @RequiredArgsConstructor
public enum ChargerType {
    DC_FAST("DC"),
    AC_3("AC3상"),
    DC_DEMO("DC데모"),
    SLOW("완속");
    private final String title;

}
