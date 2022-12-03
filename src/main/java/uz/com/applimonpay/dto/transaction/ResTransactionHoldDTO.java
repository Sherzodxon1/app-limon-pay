package uz.com.applimonpay.dto.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResTransactionHoldDTO {

    @JsonProperty("operationUid")
    private UUID operationUid;

    @JsonProperty("needConfirm")
    private Boolean needConfirm = Boolean.FALSE;

}
