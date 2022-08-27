package com.user.management.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "T_USER")
public class User {
    @Id
    @Getter @Setter @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter @Column(name = "name")
    private String name;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "password")
    private String password;
}
