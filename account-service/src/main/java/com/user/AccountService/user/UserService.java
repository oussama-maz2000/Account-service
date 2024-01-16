package com.user.AccountService.user;

import com.user.AccountService.dao.entity.User;
import com.user.AccountService.dao.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User createUser(User user){
        userRepository.save(user);
        return user;
    }


}
