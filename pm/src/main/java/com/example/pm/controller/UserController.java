package com.example.pm.controller;

import com.example.pm.model.User;
import com.example.pm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

/*    @PostMapping("/register")
    public User registerUser(@RequestParam String username, @RequestParam String password){
        return userService.registerUser(username, password);
    }*/
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
}

}
