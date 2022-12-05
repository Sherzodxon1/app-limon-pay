package uz.applimonpay.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import uz.applimonpay.dto.user.UserCreateDTO;
import uz.applimonpay.dto.user.UserDTO;
import uz.applimonpay.dto.user.UserUpdateDTO;
import uz.applimonpay.entity.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "middleName", source = "middleName")
    @Mapping(target = "phone", source = "phone")
    UserDTO toDto(User user);

    @Mapping(target = "id",ignore = true)
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "middleName", source = "middleName")
    @Mapping(target = "phone", source = "phone")
    User toEntity(UserCreateDTO dto);

    @Mapping(target = "firstName", source = "dto.firstName")
    @Mapping(target = "lastName", source = "dto.lastName")
    @Mapping(target = "middleName", source = "dto.middleName")
    @Mapping(target = "phone", source = "dto.phone")
    User toEntity(@MappingTarget User user, UserUpdateDTO dto);

    List<UserDTO> toDtoList(List<User> userList);
}
