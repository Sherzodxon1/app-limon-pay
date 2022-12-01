package uz.com.applimonpay.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.com.applimonpay.base.BaseEntity;
import uz.com.applimonpay.enums.CardType;
import uz.com.applimonpay.enums.CurrencyEnum;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_cards")
public class Card extends BaseEntity {

    @Column(name = "pan", nullable = false)
    private String pan;

    @Column(name = "expiry", nullable = false)
    private String expiry;

    @Column(name = "masked_pan", nullable = false)
    private String maskedPan;

    @Column(name = "card_holder_name", nullable = false)
    private String cardHolderName;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "card_type")
    private CardType type;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "currency")
    private CurrencyEnum currency;

    @Column(name = "balance")
    private Long balance;

    @Column(name = "phone")
    private String phone; // sms info

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;
    @Column(name = "user_id")
    private Long userId;

}
