package com.example.demo.entity.hw;

import lombok.Data;

@Data
public class Member {
    //아이디, 패스워드, 회원 번호, 회원 이름, 전화번호

    private int memberNo;
    private String id;
    private String password;
    private String name;
    private String phoneNo;



    // private Date regDate;
}
