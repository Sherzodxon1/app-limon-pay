package uz.applimonpay.dto.card;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.applimonpay.dto.user.UserDTO;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {

    private Integer id;

    private String pan;

    private Integer expiry;

    private String maskedPan;

    private String cardHolderName;

    private String type;

    private String currency;

    private String phone;

    private Integer balance;

    private UserDTO user;
}
