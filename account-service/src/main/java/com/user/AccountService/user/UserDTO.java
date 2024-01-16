package com.user.AccountService.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class UserDTO {

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private String phone;

    private String type;

    private String job;

}
