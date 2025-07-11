package com.bash.rolebasecrud.dao;

import com.bash.rolebasecrud.model.Role;

public interface RoleDao {
    public Role findRoleByName(String theRoleName);
}
