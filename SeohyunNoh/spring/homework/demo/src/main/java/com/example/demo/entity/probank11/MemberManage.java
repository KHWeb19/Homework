package com.example.demo.entity.probank11;

import lombok.Data;

import java.util.Date;

@Data
public class MemberManage {
    private int memberNo; // db명 : member_no
    private String id;
    private String password;
    private String name;
    private Date regDate; // db명 : reg_date
}
