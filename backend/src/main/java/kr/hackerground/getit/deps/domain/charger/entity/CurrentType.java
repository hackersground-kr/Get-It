package kr.hackerground.getit.deps.domain.charger.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter @RequiredArgsConstructor
public enum CurrentType {
    AVAILABLE("사용가능"),
    UNAVAILABLE("사용불가능"),
    CHARGING("충전중");
    private final String title;
}
