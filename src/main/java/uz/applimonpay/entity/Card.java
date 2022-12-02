package uz.applimonpay.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.applimonpay.base.BaseEntity;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cards")
public class Card extends BaseEntity {

    @Column(name = "pans",unique = true)
    private String pan;

    @Column(name = "expiry")
    private Integer expiry;

    @Column(name = "masked_pan")
    private String maskedPan;

    @Column(name = "card_holder_name")
    private String cardHolderName;

    @Column(name = "type")
    private String type;

    @Column(name = "currency")
    private String currency;

    @Column(name = "phone")
    private String phone;

    @Column(name = "balance")
    private Integer balance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;

    @Column(name = "user_id")
    private Integer userId;


}

