package com.example.bank.entity.bank11;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int userNo;
    private String userId;
    private String userPassword;
    private String userName;
    private Date signUpDate;
}
