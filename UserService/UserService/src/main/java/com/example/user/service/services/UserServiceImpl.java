package com.example.user.service.services;

import com.example.user.service.entities.User;
import com.example.user.service.exceptions.ResourceNotFoundException;
import com.example.user.service.models.ForgotPasswordRequest;
import com.example.user.service.models.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.user.service.repo.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    // create/add user
    @Override
    public User saveUser(User user) {
        userRepo.save(user);
        return user;
    }

    //get all users
    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepo.findAll();
    }

    //get single user
    @Override
    public Optional<User> getById(String userId) {
        return Optional.ofNullable(userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id: " + userId + "not found on server")));
        //lambda is used to call the parameterized constructor exception
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    //delete user by id
    @Override
    public void deleteById(String userId) {
        if (userRepo.existsById(userId)){
            userRepo.deleteById(userId);
        }
        else{
            throw new ResourceNotFoundException("User with given id: " + userId + "not found on server");
        }
    }

    @Override
    public boolean userLogin(LoginRequest loginRequest) {
        //fetch details based on userId
        Optional<User> userDetails = userRepo.findById(loginRequest.getUserId());
        System.out.println(userDetails);
        if(userDetails.isPresent() && userDetails.get().getUserName() == loginRequest.getUserName() && userDetails.get().getPassword() == loginRequest.getPassword()) {  // isPresent checks if the variable is empty or not
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public boolean forgotPassword(ForgotPasswordRequest forgotPasswordRequest) {

        return false;
    }
}
