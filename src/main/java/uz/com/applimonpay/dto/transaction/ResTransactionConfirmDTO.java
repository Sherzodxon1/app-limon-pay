package uz.com.applimonpay.dto.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResTransactionConfirmDTO {

    @JsonProperty("message")
    private String message;

}
