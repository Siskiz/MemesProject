package com.example.memes.dao;

import com.example.memes.entity.User;
import jakarta.persistence.EntityManager;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//TODO add realisation Spring Data JPA
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        Query query = entityManager.createQuery("FROM User");
        List<User> allUsers = query.getResultList();
        return allUsers;
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        entityManager.merge(user);
    }
    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(int id) {
        User user = getUser(id);
        entityManager.remove(user);
    }
}
