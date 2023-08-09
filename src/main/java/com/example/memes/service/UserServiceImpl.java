package com.example.memes.service;

import com.example.memes.dao.UserRepository;
import com.example.memes.entity.User;
import com.example.memes.exception.ResavingUserException;
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
    public User saveUser(User user) {
        Optional<User> optional = userRepository.findById(user.getId());
        if (optional.isPresent()) {
            throw new ResavingUserException(user);
        }
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        userRepository.deleteById(user.getId());
        return userRepository.save(user);
    }


    @Override
    @Transactional
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
