package com.user.management.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
@Table(name = "T_USER")
public class User {
    @Id
    @Getter @Setter @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter @Setter @Column(name = "name")
    private String name;
    @Getter @Setter @Column(name = "email",unique=true)
    @Email
    private String email;
    @Getter @Setter @Column(name = "password")
    private String password;
    @Getter @Setter
    @Transient
    private Phone[] phones;
    @Getter @Setter
    @Transient
    private Date created;
    @Getter @Setter
    @Transient
    private Date last_login;
    @Getter @Setter
    @Transient
    private Boolean isActive;
    @Getter @Setter @Column(name = "token")
    private String token;

}
