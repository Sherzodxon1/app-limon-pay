package uz.applimonpay.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.applimonpay.base.BaseURI;
import uz.applimonpay.common.ResponseData;
import uz.applimonpay.dto.card.CardCreateDTO;
import uz.applimonpay.dto.card.CardDTO;
import uz.applimonpay.dto.card.CardUpdateDTO;
import uz.applimonpay.service.CardService;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(BaseURI.API + BaseURI.V1 + BaseURI.CARD)
public class CardController {

    private final CardService service;

    @GetMapping(BaseURI.GET + BaseURI.ALL)
    public ResponseEntity<ResponseData<List<CardDTO>>> getAll() {
        return service.getAll();
    }

    @GetMapping(BaseURI.GET + "/{uuid}")
    public ResponseEntity<ResponseData<CardDTO>> get(@PathVariable(value = "uuid") UUID userUid) {
        return service.get(userUid);
    }

    @PostMapping(BaseURI.ADD)
    public ResponseEntity<ResponseData<CardDTO>> add(@Valid @RequestBody CardCreateDTO dto) {
        return service.add(dto);
    }

    @PutMapping(BaseURI.EDIT)
    public ResponseEntity<ResponseData<CardDTO>> edit(@Valid @RequestBody CardUpdateDTO dto) {
        return service.edit(dto);
    }

    @PutMapping(BaseURI.DELETE)
    public ResponseEntity<ResponseData<Boolean>> delete(Long id) {
        return service.delete(id);
    }

}
