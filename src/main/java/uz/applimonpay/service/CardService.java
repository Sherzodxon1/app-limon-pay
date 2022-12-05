package uz.applimonpay.service;

import org.springframework.http.ResponseEntity;
import uz.applimonpay.common.ResponseData;
import uz.applimonpay.dto.card.CardCreateDTO;
import uz.applimonpay.dto.card.CardDTO;
import uz.applimonpay.dto.card.CardUpdateDTO;

import java.util.List;
import java.util.UUID;

public interface CardService {


    ResponseEntity<ResponseData<List<CardDTO>>> getAll();

    ResponseEntity<ResponseData<CardDTO>> get(UUID cardUid);

    ResponseEntity<ResponseData<CardDTO>> add(CardCreateDTO dto);

    ResponseEntity<ResponseData<CardDTO>> edit(CardUpdateDTO dto);

    ResponseEntity<ResponseData<Boolean>> delete(Long id);
}
