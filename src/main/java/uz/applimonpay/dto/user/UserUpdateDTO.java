package uz.applimonpay.dto.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
@ToString
public class UserUpdateDTO {

    @NotNull(message = "Id is required !!!")
    private Long id;

    @NotBlank(message = "First_name is required !!!")
    private String firstName;

    @NotBlank(message = "Last_name is required !!!")
    private String lastName;

    @NotBlank(message = "Middle_name is required !!!")
    private String middleName;

    @NotBlank(message = "Phone is required !!!")
    private String phone;

    @NotNull(message = "Password is required !!!")
    private Integer password;
}
