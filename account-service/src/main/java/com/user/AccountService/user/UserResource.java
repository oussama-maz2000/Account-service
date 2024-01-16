package com.user.AccountService.user;

import com.user.AccountService.dao.entity.Pharmacy;
import com.user.AccountService.dao.entity.User;
import com.user.AccountService.dao.repository.PharmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserResource {

    private final UserService userService;
    private final PharmaRepository pharmaRepository;

    @RequestMapping("/create")
    @PostMapping()
    public String createNewUser(@RequestBody UserData data) {
        User usr = new User(data.getFirstname(), data.getLastname(), data.getEmail(),
                data.getPassword(), data.getPhone(), data.getType(), data.getOccupation());
        User user = userService.createUser(usr);
        if (data.getType().equals("professional")) {
            Pharmacy phm = new Pharmacy(data.getName(), data.getAddress(),
                    data.getWillaya(), data.getEmailPh(), data.getPhonePh());
            phm.setUsr(user);
            pharmaRepository.save(phm);
        }
        return "good";
    }
}
