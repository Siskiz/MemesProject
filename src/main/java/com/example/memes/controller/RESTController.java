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

    @GetMapping("/error")
    public String showErrorPage() {
        return "error-user";
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
    public RedirectView addUser(@ModelAttribute("user") User user, RedirectAttributes redirectAttributes) {
        User savedUser = userService.saveUser(user);
        final RedirectView redirectView = new RedirectView("/api/users/" + savedUser.getId(), true);
        redirectAttributes.addFlashAttribute("savedUser", savedUser);
        redirectAttributes.addFlashAttribute("addUserSuccess", true);
        return redirectView;
    }

    @GetMapping("/updateUser")
    public String updateUser(@RequestParam("userId") int id, Model model) {
        User updateUser = userService.getUser(id);
        model.addAttribute("user", updateUser);
        return "update-user";
    }
    @PostMapping("/updateUser")
    public RedirectView updateUser(@ModelAttribute("user") User user, RedirectAttributes redirectAttributes) {
        User updatedUser = userService.updateUser(user);
        final RedirectView redirectView = new RedirectView(("/api/users/" + updatedUser.getId()), true);
        redirectAttributes.addFlashAttribute("updatedUser", updatedUser);
        redirectAttributes.addFlashAttribute("updateUserSuccess", true);
        return redirectView;
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

}
