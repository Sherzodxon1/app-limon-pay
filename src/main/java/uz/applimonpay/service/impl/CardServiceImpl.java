package uz.applimonpay.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.applimonpay.service.CardService;
import uz.applimonpay.common.ResponseData;
import uz.applimonpay.dto.card.CardCreateDTO;
import uz.applimonpay.dto.card.CardDTO;
import uz.applimonpay.dto.card.CardUpdateDTO;
import uz.applimonpay.entity.Card;
import uz.applimonpay.mapper.CardMapper;
import uz.applimonpay.repository.CardRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
    private final CardRepository repository;

    private final CardMapper mapper;

    @Override
    public ResponseEntity<ResponseData<List<CardDTO>>> getAll() {
        List<Card> list = repository.findAll();
        List<CardDTO> dtoList = new ArrayList<>();
        list.forEach(card -> dtoList.add(mapper.toDto(card)));
        return ResponseData.success200(dtoList);
    }

    @Override
    public ResponseEntity<ResponseData<CardDTO>> get(Integer id) {

        Optional<Card> cardOptional = repository.findById(id);
        if (cardOptional.isEmpty()) {
            throw new RuntimeException("Card is not found !!!");
        }
        return ResponseData.success200(mapper.toDto(cardOptional.get()));
    }

    @Override
    public ResponseEntity<ResponseData<CardDTO>> add(CardCreateDTO dto) {

        Card card = mapper.toEntity(dto);
        repository.save(card);
        return ResponseData.success201(mapper.toDto(card));
    }

    @Override
    public ResponseEntity<ResponseData<CardDTO>> edit(CardUpdateDTO dto) {

        Optional<Card> cardOptional = repository.findById(dto.getId());
        if (cardOptional.isEmpty()) {
            throw new RuntimeException("Employee is not found !!!");
        }
        Card card = mapper.toEntity(cardOptional.get(), dto);
        repository.save(card);
        return ResponseData.success201(mapper.toDto(card));
    }

    @Override
    public ResponseEntity<ResponseData<Boolean>> delete(Integer id) {

        Optional<Card> cardOptional = repository.findById(id);
        if (cardOptional.isEmpty()) {
            throw new RuntimeException("Card is not found !!!");
        }
        repository.delete(cardOptional.get());
        return ResponseData.success200(true);
    }
}
