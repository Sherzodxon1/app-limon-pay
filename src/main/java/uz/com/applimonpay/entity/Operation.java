package uz.com.applimonpay.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.com.applimonpay.base.BaseEntity;
import uz.com.applimonpay.enums.CurrencyEnum;
import uz.com.applimonpay.enums.OperationStatus;
import uz.com.applimonpay.enums.OperationType;
import uz.com.applimonpay.helper.LocalDateTimeConverter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "operations")
public class Operation extends BaseEntity {

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private OperationStatus status;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "commission")
    private Long commission;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "currency")
    private CurrencyEnum currency;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "sender_pan")
    private String senderPan;

    @Column(name = "sender_token")
    private String senderToken;

    @Column(name = "sender_merchant")
    private String senderMerchant;

    @Column(name = "sender_terminal")
    private String senderTerminal;

    @Column(name = "receiver_pan")
    private String receiverPan;

    @Column(name = "receiver_token")
    private String receiverToken;

    @Column(name = "receiver_merchant")
    private String receiverMerchant;

    @Column(name = "receiver_terminal")
    private String receiverTerminal;

    @Column(name = "operation_code")
    private String operationCode;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "type")
    private OperationType type;

    @Column(name = "start_time", columnDefinition = "TIMESTAMP default NOW()")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime startTime = LocalDateTime.now();

    @Column(name = "end_time", columnDefinition = "TIMESTAMP default null")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime endTime;

    @Column(name = "need_confirm", columnDefinition = "BOOLEAN default false")
    private Boolean needConfirm = Boolean.FALSE;

    @Column(name = "confirm_code")
    private String confirmCode;

}
