package com.indgo.service;

import com.indgo.dto.UserDto;
import com.indgo.entity.User;

public interface UserService {
    User createUser(UserDto userDto);
    User findByUsername(String username);
}
