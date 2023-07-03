package com.example.memes.controller;

import com.example.memes.entity.User;
import com.example.memes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> showAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        return allUsers;
    }

    @GetMapping("/users/{id}")
    //@PathVariable берет информацию из строки поиска
    public User getUser(@PathVariable int id) {
        User user = userService.getUser(id);
        return user;
    }

    @PostMapping("/users")
    public void addNewUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PutMapping("/users")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

}
