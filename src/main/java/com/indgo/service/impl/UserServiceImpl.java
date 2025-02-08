package com.indgo.service.impl;

import com.indgo.dto.UserDto;
import com.indgo.entity.User;
import com.indgo.repository.UserRepository;
import com.indgo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(UserDto userDto) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }
}
