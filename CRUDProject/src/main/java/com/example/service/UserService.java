package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.User;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}