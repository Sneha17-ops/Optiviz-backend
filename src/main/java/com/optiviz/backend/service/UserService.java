package com.optiviz.backend.service;

import com.optiviz.backend.entity.User;
import com.optiviz.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createIfNotExists(User user) {
        return userRepository
                .findByClerkUserId(user.getClerkUserId())
                .orElseGet(() -> userRepository.save(user));
    }
}