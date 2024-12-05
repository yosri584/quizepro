package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;



public interface utilisateurRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
}
