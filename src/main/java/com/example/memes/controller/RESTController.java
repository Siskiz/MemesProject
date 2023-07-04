package com.example.memes.controller;

import com.example.memes.entity.User;
import com.example.memes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class RESTController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String showAllUsers(Model model) {
        List<User> allUsers = userService.getAllUsers();
        model.addAttribute("users", allUsers);
        return "view-users";
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
