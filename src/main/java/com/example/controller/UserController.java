package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity<User> getUser(@RequestParam("id") long id) {
//        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
//    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        if (user == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }
}
