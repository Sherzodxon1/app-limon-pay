package uz.applimonpay.dto.card;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class CardCreateDTO {

    @NotBlank(message = "Pan is required !!!")
    private String pan;

    @NotNull(message = "Expiry is required !!!")
    private Integer expiry;

    @NotBlank(message = "MaskedPan is required !!!")
    private String maskedPan;

    @NotBlank(message = "CardHolderName is required !!!")
    private String cardHolderName;

    @NotBlank(message = "Type is required !!!")
    private String type;

    @NotBlank(message = "Currency is required !!!")
    private String currency;

    @NotBlank(message = "Phone is required !!!")
    private String phone;

    @NotNull(message = "Balance is required !!!")
    private Integer balance;

    @NotNull(message = "User_id is required !!!")
    private Integer userId;
}
