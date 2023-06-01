package com.huynm.bookstore.controller;

import com.huynm.bookstore.entities.User;
import com.huynm.bookstore.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "/v1/api/user")
public class CustomUserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public ResponseEntity<?> getUser(@RequestBody String username){
        User user = userService.findByUsername(username);

        return ResponseEntity.ok().body(user);
    }
}
