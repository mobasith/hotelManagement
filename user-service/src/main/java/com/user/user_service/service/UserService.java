package com.user.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service.entity.User;

@Service
public interface UserService {

    // i want to save the user
    User saveUser(User user);

    // get all the user
    List<User> getAllUser();

    // get all the user with give Id
    User getUser(long userId);

}
