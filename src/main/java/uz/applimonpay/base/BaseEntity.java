package uz.applimonpay.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Integer id;


    @Column(name = "is_active", columnDefinition = "numeric default 1")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    protected boolean active = true;


    @Column(name = "uuid")
    protected UUID uuid = UUID.randomUUID();

}

