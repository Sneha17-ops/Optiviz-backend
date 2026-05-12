package com.optiviz.backend.controller;

import com.optiviz.backend.entity.User;
import com.optiviz.backend.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @PostMapping("/sync")
    public User syncUser(@RequestBody User user) {
        return userService.createIfNotExists(user);
    }
}