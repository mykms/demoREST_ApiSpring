package com.example.controller;

import com.example.entity.dto.ResponseDTO;
import com.example.entity.user.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getAllUsers() {
        return new ResponseEntity<>(new ResponseDTO(userService.getAll()), HttpStatus.OK);
    }

    @GetMapping(value = "/identifier/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getUserById(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(new ResponseDTO(userService.getUser(id)), HttpStatus.OK);
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@RequestParam("id") Long id) {
        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }

    @GetMapping(value = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getUsersByName(@PathVariable(name = "name") String name) {
        return new ResponseEntity<>(userService.getUsers(name), HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> addUser(@RequestBody User user, @RequestParam(name = "id", required = false) Long id) {
        if (Objects.isNull(user))
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }

    @DeleteMapping(value = "/action/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteUserById(@PathVariable(name = "id") Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // ????
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> updateUserNameById(@RequestBody User user) {
        User newUser = new User(user.getUser_login(), user.getUser_password(), user.getFirstName(), user.getSurname(),
                user.getPatronymic(), user.getAge(), user.getUserType(), user.getGender());
        newUser.setFirstName("Familiya");
        newUser.setAge((short)(user.getAge() + 15));
        return new ResponseEntity<>(userService.updateUserName(user), HttpStatus.OK);
    }
}
