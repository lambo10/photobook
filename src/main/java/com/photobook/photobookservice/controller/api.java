package com.photobook.photobookservice.controller;

import com.photobook.photobookservice.dal.user_repo;
import com.photobook.photobookservice.entity.user;
import com.photobook.photobookservice.services.userOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class api {
    @Autowired
    private userOperations userOperations;
    @GetMapping(value = "userLogin/{email}")
    public user getStudentByEmail(@PathVariable("email") String email) {
        return userOperations.findUserByEmail(email);
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody user user) {
        userOperations.saveOrUpdateUser(user);
        return new ResponseEntity("Student added successfully", HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<?> test(){
        return new ResponseEntity("photobook services v.1.0", HttpStatus.OK);
    }

    @RequestMapping("user/login")
    public ResponseEntity<?> login(@RequestBody user user)
    {
        userOperations.saveOrUpdateUser(user);
        return new ResponseEntity("Student added successfully", HttpStatus.OK);
    }

}
