package com.example.demo.domain;

import lombok.Data;

@Data
public class Page {
    // 페이징은 내가 혼자 만들기는 어려울거같다 ;;
    public int pageNum;
    public int amount;

    public Page() {
        this(1, 10);
    }

    public Page(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }
}
