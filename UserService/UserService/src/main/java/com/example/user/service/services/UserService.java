package com.example.user.service.services;

import com.example.user.service.entities.User;
import com.example.user.service.models.ForgotPasswordRequest;
import com.example.user.service.models.LoginRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {
    //User Operations

    //create user
    User saveUser(User user);

    //get all users
    List<User> getAllUsers();

    //get user by id
    Optional<User> getById(String userId);

    //update user
    User updateUser(User user);

    //delete User by id
    void deleteById(String userId);

    //login
    boolean userLogin(LoginRequest loginRequest);

    //forgot password
    boolean forgotPassword(ForgotPasswordRequest forgotPasswordRequest);
}
