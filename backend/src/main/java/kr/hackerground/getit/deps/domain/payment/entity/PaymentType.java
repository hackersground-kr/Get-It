package kr.hackerground.getit.deps.domain.payment.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter @RequiredArgsConstructor
public enum PaymentType {
    CARD("카드"),
    DAEGU_HAPPY_PAY("대구행복페이"),
    DAEGU_RO_CARD("대구로카드"),
    DEPOSIT("입금"),
    ONNURI_GIFT_CARD("온누리 상품권");
    private final String title;
}
