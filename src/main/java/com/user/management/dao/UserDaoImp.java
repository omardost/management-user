package com.user.management.dao;

import com.user.management.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Repository
@Transactional
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User create(User user) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        user.setToken(uuidAsString);
        entityManager.merge(user);
        return user;
    }
}
