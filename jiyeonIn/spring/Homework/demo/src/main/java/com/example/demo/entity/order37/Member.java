package com.example.demo.entity.order37;

import lombok.Data;

import java.util.Date;

@Data
public class Member {
    private int memberNo;
    private String id;
    private String password;
    private String name;
    private String email;
    private Date regDate;
}
