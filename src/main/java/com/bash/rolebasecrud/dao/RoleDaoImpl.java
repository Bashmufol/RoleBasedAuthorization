package com.bash.rolebasecrud.dao;

import com.bash.rolebasecrud.model.Role;
import com.bash.rolebasecrud.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class RoleDaoImpl implements RoleDao {
    private EntityManager entityManager;

    @Override
    public Role findRoleByName(String theRoleName) {
        TypedQuery<Role> theQuery = entityManager.createQuery("from Role where userName=:roleName", Role.class);
        theQuery.setParameter("roleName", theRoleName);
        User theUser = null;
        try{
            theUser = theQuery.getSingleResult();
        } catch (Exception e){theUser = null;}
        return theUser;
    }
}
