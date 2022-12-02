package uz.applimonpay.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {

    private Integer id;

    private String firstName;

    private String lastName;

    private String middleName;

    private String phone;

    private Integer password;

}
