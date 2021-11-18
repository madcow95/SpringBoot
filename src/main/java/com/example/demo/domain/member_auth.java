package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "member_auth")
public class member_auth {

    @Id
    private String username;
    private String auth;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getUsername() {
        return username;
    }

    public String getAuth() {
        return auth;
    }
}
