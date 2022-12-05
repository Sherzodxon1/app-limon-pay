package uz.applimonpay.dto.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.applimonpay.dto.BaseAmount;


@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqTransactionHoldDTO {

    @JsonProperty("sender")
    private ReqTransactionParam sender;

    @JsonProperty("receiver")
    private ReqTransactionParam receiver;

    @JsonProperty("amount")
    private BaseAmount amount;

}

