package uz.applimonpay.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import uz.applimonpay.dto.card.CardCreateDTO;
import uz.applimonpay.dto.card.CardDTO;
import uz.applimonpay.dto.card.CardUpdateDTO;
import uz.applimonpay.entity.Card;

@Mapper(componentModel = "spring")
public interface CardMapper {

    @Mapping(target = "pan", source = "pan")
    @Mapping(target = "expiry", source = "expiry")
    @Mapping(target = "maskedPan", source = "maskedPan")
    @Mapping(target = "cardHolderName", source = "cardHolderName")
    @Mapping(target = "type", source = "type")
    @Mapping(target = "currency", source = "currency")
    @Mapping(target = "phone", source = "phone")
    @Mapping(target = "balance", source = "balance")
    @Mapping(target = "user", source = "user")
    CardDTO toDto(Card card);

    @Mapping(target = "pan", source = "pan")
    @Mapping(target = "expiry", source = "expiry")
    @Mapping(target = "maskedPan", source = "maskedPan")
    @Mapping(target = "cardHolderName", source = "cardHolderName")
    @Mapping(target = "type", source = "type")
    @Mapping(target = "currency", source = "currency")
    @Mapping(target = "phone", source = "phone")
    @Mapping(target = "balance", source = "balance")
    @Mapping(target = "userId", source = "userId")
    Card toEntity(CardCreateDTO dto);

    @Mapping(target = "pan", source = "dto.pan")
    @Mapping(target = "expiry", source = "dto.expiry")
    @Mapping(target = "maskedPan", source = "dto.maskedPan")
    @Mapping(target = "cardHolderName", source = "dto.cardHolderName")
    @Mapping(target = "type", source = "dto.type")
    @Mapping(target = "currency", source = "dto.currency")
    @Mapping(target = "phone", source = "dto.phone")
    @Mapping(target = "balance", source = "dto.balance")
    @Mapping(target = "userId", source = "dto.userId")
    Card toEntity(@MappingTarget Card card, CardUpdateDTO dto);
}
