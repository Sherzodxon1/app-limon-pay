package uz.applimonpay.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.applimonpay.enums.TransactionType;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "epos", uniqueConstraints = {
        @UniqueConstraint(name = "uk_operation_code_transaction_type",
                columnNames = {"operation_code", "transaction_type"}
        )
})
public class Epos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "merchant_id")
    private String merchantId;

    @Column(name = "terminal_id")
    private String terminalId;

    @Column(name = "operation_code")
    private String operationCode;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "transaction_type")
    private TransactionType transactionType;

}

