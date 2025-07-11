package com.bash.rolebasecrud.dao;

import com.bash.rolebasecrud.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao {
    private final EntityManager entityManager;
    @Override
    public User findByUserName(String theUserName) {
        TypedQuery<User> theQuery = entityManager.createQuery("from User where userName=:uName and enabled=true", User.class);
        theQuery.setParameter("uName", theUserName);
        User theUser = null;
        try{
            theUser = theQuery.getSingleResult();
        } catch (Exception e){theUser = null;}
        return theUser;
    }
}
