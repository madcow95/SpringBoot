package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "freeboard")
public class freeboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bno;
    private String title;
    private String content;
    private String username;
    private Integer readcount;

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setReadcount(Integer readcount) {
        this.readcount = readcount;
    }

    public Integer getBno() {
        return bno;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }

    public Integer getReadcount() {
        return readcount;
    }
}
