package uz.com.applimonpay.dto.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.com.applimonpay.enums.FieldGroup;

import java.util.UUID;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqTransactionParam {

    @JsonProperty("group")
    private FieldGroup group;

    @JsonProperty("uuid")
    private UUID uuid;

    @JsonProperty("pan")
    private String pan;

}
