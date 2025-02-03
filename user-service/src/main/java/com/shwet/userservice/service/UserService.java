package com.shwet.userservice.service;

import com.shwet.userservice.model.User;
import com.shwet.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public void updateUserBalance(Long userId, Double balance) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            user.setBalance(user.getBalance() - balance);
            userRepository.save(user);
        }
    }

    // Additional methods for updating portfolio
}
