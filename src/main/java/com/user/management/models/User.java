package com.user.management.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_USER")
public class User {
    @Id
    @Getter @Setter @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.UUID)
    //@GenericGenerator(name = "uuid", strategy = "uuid2")
    //@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private Long id;
    @Getter @Setter @Column(name = "name")
    private String name;
    @Getter @Setter @Column(name = "email",unique=true)
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
    @Transient
    private boolean isactive;
    @Getter @Setter @Column(name = "token")
    private String token;

}
