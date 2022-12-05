package uz.applimonpay.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.applimonpay.enums.CurrencyEnum;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseAmount {

    private Long amount;

    private Short scale;

    private CurrencyEnum currency;

    public BaseAmount(Long amount) {
        this.amount = amount;
        this.scale = 2;
        this.currency = CurrencyEnum.UZS;
    }

    public BaseAmount(Long amount, CurrencyEnum currency) {
        this.amount = amount;
        this.scale = 2;
        this.currency = currency;
    }

}

