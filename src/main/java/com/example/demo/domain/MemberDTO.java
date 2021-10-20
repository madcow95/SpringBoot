package com.example.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="tbl_member")
public class MemberDTO {

    @Id
    public String username;

    public String password;
    public String irum;
    public String email;
    public String address;

}
