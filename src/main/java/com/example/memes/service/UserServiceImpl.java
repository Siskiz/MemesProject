package com.example.memes.service;

import com.example.memes.dao.UserRepository;
import com.example.memes.entity.User;
import com.example.memes.exception.UserNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User getUser(int id) {
        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new UserNotFound("User not found by id = " + id);
        }
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }


    @Override
    @Transactional
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
