package com.example.memes.dao;

import com.example.memes.entity.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();
    public User getUser(int id);
    public void saveUser(User user);
    public void deleteUser(int id);

}
