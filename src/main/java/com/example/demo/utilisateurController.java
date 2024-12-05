package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class utilisateurController {

    @Autowired
    private utilisateurService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody User user) {
    
        return ResponseEntity.ok("User registered successfully");
    }


    @PostMapping("/signin")
    public boolean signin(@RequestParam String email, @RequestParam String password) {
    	System.out.println("Received email: " + email);
    	System.out.println("Received password: " + password);

        return userService.signin(email, password);
    }
}
