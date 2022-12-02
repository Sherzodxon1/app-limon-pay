package uz.applimonpay.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CardType {
    HUMO("Humo"),
    UZCARD("Uzcard"),
    VISA("Visa");

    private final String name;
}
