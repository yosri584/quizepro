package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class utilisateurService {

    @Autowired
    private utilisateurRepository userRepository;

  
    

    // Méthode pour l'inscription
    public User signup(User user) {
        // Vérifie si un utilisateur avec le même email existe déjà
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("Email already in use");
        }

        // Enregistre l'utilisateur
        return userRepository.save(user);
    }

 
    public boolean signin(String email, String password) {
        User user = userRepository.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}
