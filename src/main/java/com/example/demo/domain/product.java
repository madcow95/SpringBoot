package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "product")
public class product {

    @Id
    private int pno;
    private String username;
    private String pName;
    private String pTitle;
    private String pContent;
    private int pReadCount;
    private int pBuyCount;
    private int pPrice;

    public void setPno(int pno) {
        this.pno = pno;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public void setpReadCount(int pReadCount) {
        this.pReadCount = pReadCount;
    }

    public void setpBuyCount(int pBuyCount) {
        this.pBuyCount = pBuyCount;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public String getpName() {
        return pName;
    }

    public String getUsername() {
        return username;
    }

    public String getpTitle() {
        return pTitle;
    }

    public String getpContent() {
        return pContent;
    }

    public int getpReadCount() {
        return pReadCount;
    }

    public int getpBuyCount() {
        return pBuyCount;
    }

    public int getpPrice() {
        return pPrice;
    }
}
