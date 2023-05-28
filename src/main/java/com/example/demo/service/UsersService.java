package com.example.demo.service;

import com.example.demo.entities.Groupe;
import com.example.demo.entities.Utilisateur;

import javax.swing.*;

public interface UsersService {
    Utilisateur saveUser(Utilisateur utilisateur);
    Groupe saveGroupe(Groupe groupe);
    void addUserToGroup(String userName,String groupeName);
    Utilisateur findByUsername(String userName);
}
