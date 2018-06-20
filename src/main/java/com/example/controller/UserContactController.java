package com.example.controller;

import com.example.entity.dto.ErrorDTO;
import com.example.entity.dto.ResponseDTO;
import com.example.entity.user.User;
import com.example.entity.user.UserContact;
import com.example.service.user.UserContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/user/contact")
public class UserContactController {
    @Autowired
    private UserContactService contactService;

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getContactsByUser(User user) {
        if (Objects.isNull(user) || user.getId() == null) {
            return new ResponseEntity<>(
                    new ResponseDTO<>(user, getErrorEmtyObject()), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(new ResponseDTO<>(contactService.getAllByUser(user)), HttpStatus.OK);
        }
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getAllContacts() {
        return new ResponseEntity<>(new ResponseDTO<>(contactService.getAllContacts()), HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> addContact(@RequestBody UserContact contact) {
        if (Objects.isNull(contact) || contact.getUser() == null) {
            return new ResponseEntity<>(new ResponseDTO<>(contact, getErrorEmtyObject()), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(new ResponseDTO<>(contactService.addContact(contact)), HttpStatus.OK);
        }
    }

    private ErrorDTO getErrorEmtyObject() {
        return new ErrorDTO(HttpStatus.BAD_REQUEST.value(),"Передаваемый объект пуст",
                HttpStatus.BAD_REQUEST.getReasonPhrase());
    }
}
