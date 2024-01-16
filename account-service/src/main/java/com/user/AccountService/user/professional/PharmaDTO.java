package com.user.AccountService.user.professional;

import com.user.AccountService.dao.entity.User;
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
public class PharmaDTO {
    private String name;
    private String address;
    private String willaya;


}
