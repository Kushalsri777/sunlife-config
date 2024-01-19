package com.example.user.service.controller;

import com.example.user.service.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.user.service.services.UserServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class AppController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    //add user (registeration)
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User user1 = userServiceImpl.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //login
//    @GetMapping("/login")

    //get single user
    @GetMapping("/getSingle/{id}")
    public ResponseEntity<Optional<User>> getSingleUser(@PathVariable String id){
        Optional<User> user = userServiceImpl.getById(id);
        return ResponseEntity.ok().body(user);
    }


    //get all users
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAll(){
        List<User> users = userServiceImpl.getAllUsers();
        return ResponseEntity.ok().body(users);
    }

    //update user

    //delete user
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable String id){
        userServiceImpl.deleteById(id);
        return ResponseEntity.ok().body("User deleted successfully");
    }

    //forgot password

}
