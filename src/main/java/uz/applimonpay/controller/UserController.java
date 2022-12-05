package uz.applimonpay.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.applimonpay.base.BaseURI;
import uz.applimonpay.common.ResponseData;
import uz.applimonpay.dto.user.UserCreateDTO;
import uz.applimonpay.dto.user.UserDTO;
import uz.applimonpay.dto.user.UserUpdateDTO;
import uz.applimonpay.service.UserService;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(BaseURI.API + BaseURI.V1 + BaseURI.USER)
public class UserController {

    private final UserService service;

    @GetMapping(BaseURI.GET + BaseURI.ALL)
    public ResponseEntity<ResponseData<List<UserDTO>>> getAll(@RequestParam(value = "uuid") UUID userUid) {
        return service.getAll(userUid);
    }

    @GetMapping(BaseURI.GET + "/{uuid}")
    public ResponseEntity<ResponseData<UserDTO>> get(@PathVariable(value = "uuid") UUID userUid) {
        return service.get(userUid);
    }

    @PostMapping(BaseURI.ADD)
    public ResponseEntity<ResponseData<UserDTO>> add(@Valid @RequestBody UserCreateDTO dto) {
        return service.add(dto);
    }

    @PutMapping(BaseURI.EDIT)
    public ResponseEntity<ResponseData<UserDTO>> edit(@Valid @RequestBody UserUpdateDTO dto) {
        return service.edit(dto);
    }

    @PutMapping(BaseURI.DELETE)
    public ResponseEntity<ResponseData<Boolean>> delete(Long id) {
        return service.delete(id);
    }

}