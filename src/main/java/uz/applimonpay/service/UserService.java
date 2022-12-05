package uz.applimonpay.service;


import org.springframework.http.ResponseEntity;
import uz.applimonpay.common.ResponseData;
import uz.applimonpay.dto.user.UserCreateDTO;
import uz.applimonpay.dto.user.UserDTO;
import uz.applimonpay.dto.user.UserUpdateDTO;

import java.util.List;
import java.util.UUID;

public interface UserService {

    ResponseEntity<ResponseData<List<UserDTO>>> getAll(UUID userUid);

    ResponseEntity<ResponseData<UserDTO>> get(UUID userUid);

    ResponseEntity<ResponseData<UserDTO>> add(UserCreateDTO dto);

    ResponseEntity<ResponseData<UserDTO>> edit(UserUpdateDTO dto);


    ResponseEntity<ResponseData<Boolean>> delete(Long id);

    UserDTO change(String uuid, String oldPassword, String newPassword);
}
