package com.bash.rolebasecrud.service;

import com.bash.rolebasecrud.dao.RoleDao;
import com.bash.rolebasecrud.dao.UserDao;
import com.bash.rolebasecrud.model.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements  UserService {
    private UserDao userDao;
    private RoleDao roleDao;

    @Override
    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return
    }
}
