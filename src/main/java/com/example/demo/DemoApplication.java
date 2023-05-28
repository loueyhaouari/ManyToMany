package com.example.demo;

import com.example.demo.entities.Groupe;
import com.example.demo.entities.Utilisateur;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private UsersService usersService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
usersService.saveUser(new Utilisateur(null,"user1","password1",null));
usersService.saveUser(new Utilisateur(null,"admin","password2",null));
usersService.saveGroupe(new Groupe(null,"USER",null));
usersService.saveGroupe(new Groupe(null,"ADMIN",null));
usersService.addUserToGroup("user1","USER");
usersService.addUserToGroup("admin","ADMIN");
Utilisateur utilisateur=usersService.findByUsername("admin");
System.out.println("Username " + utilisateur.getUserName());
System.out.println("Password " + utilisateur.getPassword());
System.out.println("Groupes : ");
utilisateur.getGroupes().forEach(g->{
    System.out.println(g.getGroupName());
});
    }
};




