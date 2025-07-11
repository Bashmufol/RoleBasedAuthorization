package com.bash.rolebasecrud.dao;

import com.bash.rolebasecrud.model.User;

public interface UserDao {
    User findUserByName(String username);
}
