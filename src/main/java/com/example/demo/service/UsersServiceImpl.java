package com.example.demo.service;

import com.example.demo.entities.Groupe;
import com.example.demo.entities.Utilisateur;
import com.example.demo.repositories.GroupeRepository;
import com.example.demo.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
   @Autowired
   private UserRepository userRepository;
   @Autowired
   private GroupeRepository groupeRepository;
    @Override
    public Utilisateur saveUser(Utilisateur utilisateur) {
        return userRepository.save(utilisateur);
    }

    @Override
    public Groupe saveGroupe(Groupe groupe) {

        return groupeRepository.save(groupe);
    }

    @Override
    public void addUserToGroup(String userName, String groupeName) {
 Groupe groupe=groupeRepository.findByGroupName(groupeName);
 Utilisateur utilisateur=userRepository.findByUserName(userName);
 groupe.getUtilisateurs().add(utilisateur);
    }

    @Override
    public Utilisateur findByUsername(String userName) {

        return userRepository.findByUserName(userName);
    }

}
