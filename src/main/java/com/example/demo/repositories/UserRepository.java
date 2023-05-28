package com.example.demo.repositories;

import com.example.demo.entities.Utilisateur;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Utilisateur,Long> {
    Utilisateur findByUserName(String userName);
}
