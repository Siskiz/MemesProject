package com.example.memes.service;

import com.example.memes.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    public User getUser(int id);
    public void saveUser(User user);
    public void deleteUser(int id);

}
