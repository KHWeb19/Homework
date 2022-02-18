package com.example.demo.entity.proBank11;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int userNo;
    private String userId;
    private String userPw;
    private String nickName;
    private String email;
    private Date regDate;
}
