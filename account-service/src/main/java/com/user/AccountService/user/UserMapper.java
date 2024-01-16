package com.user.AccountService.user;


import com.user.AccountService.dao.entity.User;
import com.user.AccountService.user.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "password", ignore = true)
    UserDTO fromUsertoDTO(User user);

    @Mapping(target = "id", ignore = true)
    User fromDTOtoUser(UserDTO userDTO);
}
