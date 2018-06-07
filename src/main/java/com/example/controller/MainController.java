package com.example.controller;

import com.example.entity.MainObject;
import com.example.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private MainService service;

    @GetMapping
    public ResponseEntity<String> get(@RequestParam("id") Long id) {
        return new ResponseEntity<>(service.get(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MainObject> get(@RequestBody MainObject object) {
        return new ResponseEntity<>(service.get(object), HttpStatus.OK);
    }
}
