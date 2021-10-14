package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    public String username;
    public String password;
    public String irum;
    public String email;
    public String address;
    public String addressDetail;
}
