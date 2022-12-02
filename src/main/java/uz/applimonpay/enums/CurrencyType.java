package uz.applimonpay.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum CurrencyType {

    UZS(860, 'N', (short) 2),
    USD(840, 'F', (short) 2),
    EUR(978, 'F', (short) 2),
    RUB(643, 'F', (short) 2),

    UNKNOWN(-1, '.', (short) 0);

    private final Integer code;
    private final Character character;
    private final short scale;

    public static CurrencyType getByName(final String name) {
        return Arrays.stream(CurrencyType.values())
                .filter(currency -> currency.name().equalsIgnoreCase(name))
                .findFirst()
                .orElse(UNKNOWN);
    }
}