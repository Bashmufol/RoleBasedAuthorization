package com.bash.rolebasecrud.service;

import com.bash.rolebasecrud.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public User findByUserName(String userName);
}
