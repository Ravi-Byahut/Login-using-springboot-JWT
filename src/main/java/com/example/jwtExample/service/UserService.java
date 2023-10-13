package com.example.jwtExample.service;

import com.example.jwtExample.entity.User;
import com.example.jwtExample.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUser()
    {
        return userRepository.findAll();
    }

    public User createUser(User user)
    {
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }


}
