package uz.applimonpay.dto.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqTransactionConfirmDTO {

    @JsonProperty("operationUid")
    private UUID operationUid;

    @JsonProperty("confirmCode")
    private String confirmCode;

}

