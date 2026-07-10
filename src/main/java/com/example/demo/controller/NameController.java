package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    List<String> names = List.of("Amit", "Naman", "priyal");

    @GetMapping
    public ResponseEntity<List<String>> getNames() {
        return new ResponseEntity<>(names, HttpStatusCode.valueOf(200));
    }
}
