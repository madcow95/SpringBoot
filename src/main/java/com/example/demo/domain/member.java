package com.example.demo.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "member")
public class member {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "irum")
    private String irum;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

}
