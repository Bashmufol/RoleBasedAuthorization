package com.bash.rolebasecrud.dao;

import com.bash.rolebasecrud.model.User;

public interface UserDao {
    User findByUserName(String userName);
}
