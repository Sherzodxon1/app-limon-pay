package uz.applimonpay.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.applimonpay.common.ResponseData;
import uz.applimonpay.dto.user.UserCreateDTO;
import uz.applimonpay.dto.user.UserDTO;
import uz.applimonpay.dto.user.UserUpdateDTO;
import uz.applimonpay.entity.User;
import uz.applimonpay.mapper.UserMapper;
import uz.applimonpay.repository.UserRepository;
import uz.applimonpay.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final UserMapper mapper;

    @Override
    public ResponseEntity<ResponseData<List<UserDTO>>> getAll(UUID userUid) {
        List<User> list = repository.findAllByUuid(userUid);
        List<UserDTO> dtoList = new ArrayList<>();
        list.forEach(user -> dtoList.add(mapper.toDto(user)));
        return ResponseData.success200(dtoList);
    }


    @Override
    public ResponseEntity<ResponseData<UserDTO>> get(UUID userUid) {

        Optional<User> userOptional = repository.findByUuid(userUid);
        if (userOptional.isEmpty()) {
            throw new RuntimeException("User is not found !!!");
        }
        return ResponseData.success200(mapper.toDto(userOptional.get()));
    }

    @Override
    public ResponseEntity<ResponseData<UserDTO>> add(UserCreateDTO dto) {

        User user = mapper.toEntity(dto);
        repository.save(user);
        return ResponseData.success201(mapper.toDto(user));
    }

    @Override
    public ResponseEntity<ResponseData<UserDTO>> edit(UserUpdateDTO dto) {

        Optional<User> userOptional = repository.findById(dto.getId());
        if (userOptional.isEmpty()) {
            throw new RuntimeException("Employee is not found !!!");
        }
        User user = mapper.toEntity(userOptional.get(), dto);
        repository.save(user);
        return ResponseData.success201(mapper.toDto(user));
    }

    @Override
    public ResponseEntity<ResponseData<Boolean>> delete(Long id) {

        Optional<User> userOptional = repository.findById(id);
        if (userOptional.isEmpty()) {
            throw new RuntimeException("Employee is not found !!!");
        }
        repository.delete(userOptional.get());
        return ResponseData.success200(true);
    }

    @Override
    public UserDTO change(String uuid, String oldPassword, String newPassword)  {
        User user = repository.findByUuid(uuid);
        if (!user.getPassword().equals(oldPassword)){
            throw new RuntimeException("error");
        }
        user.setPassword(newPassword);
        repository.save(user);
        return mapper.toDto(user);
    }

}
