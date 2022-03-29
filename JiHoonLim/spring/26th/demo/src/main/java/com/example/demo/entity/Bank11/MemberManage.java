package com.example.demo.entity.Bank11;

import lombok.Data;

import java.util.Date;

@Data
public class MemberManage {
    private int memberNo;
    private String id;
    private String pw;
    private String name;
    private int birth;
    private int phone;
    private Date regDate;
}
