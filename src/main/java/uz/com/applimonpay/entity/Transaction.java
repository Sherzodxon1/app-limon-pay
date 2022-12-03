package uz.com.applimonpay.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.com.applimonpay.base.BaseEntity;
import uz.com.applimonpay.enums.CurrencyEnum;
import uz.com.applimonpay.enums.TransactionStatus;
import uz.com.applimonpay.enums.TransactionType;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {

    @Column(name = "operation_id")
    private Long operationId;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "type")
    private TransactionType type;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private TransactionStatus status;

    @Column(name = "request_id")
    private String requestId;

    @Column(name = "responseId")
    private String responseId;

    @Column(name = "error_message")
    private String errorMessage;

    @Column(name = "amount")
    private Long amount;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "currency")
    private CurrencyEnum currency;

}
