package com.shwet.userservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Long userId;
    private String username;
    private String email;
    private Double balance;
    private String portfolio; // Could be a list of owned stocks and quantities

    // Getters and setters
    // ...
}
