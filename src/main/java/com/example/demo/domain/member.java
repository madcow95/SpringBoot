package com.example.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "member")
public class member{

    @Id
    private String username;
    private String password;
    private String irum;
    private String email;
    private String address;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIrum(String irum) {
        this.irum = irum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getIrum() {
        return irum;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
