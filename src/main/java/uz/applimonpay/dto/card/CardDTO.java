package uz.applimonpay.dto.card;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.applimonpay.dto.user.UserDTO;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("pan")
    private String pan;

    @JsonProperty("expiry")
    private Integer expiry;

    @JsonProperty("expiry")
    private String maskedPan;

    @JsonProperty("cardHolderName")
    private String cardHolderName;

    @JsonProperty("type")
    private String type;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("balance")
    private Integer balance;

    @JsonProperty("user")
    private UserDTO user;

    private UUID uuid;
}
