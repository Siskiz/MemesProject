package com.example.memes.controller;

import com.example.memes.entity.User;
import com.example.memes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/api")
public class RESTController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public String showMainPage() {
        return "main-page";
    }

    @GetMapping("/users")
    public String showAllUsers(Model model) {
        List<User> allUsers = userService.getAllUsers();
        model.addAttribute("users", allUsers);
        return "view-all-users";
    }

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable int id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "view-user";
    }

    @GetMapping("/addUser")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "add-user";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user) {
        User savedUser = userService.saveUser(user);
        return "view-user";
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
