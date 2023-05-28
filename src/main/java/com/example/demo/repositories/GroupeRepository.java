package com.example.demo.repositories;

import com.example.demo.entities.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupeRepository extends JpaRepository<Groupe,Long> {
    Groupe findByGroupName(String groupeName);
}
