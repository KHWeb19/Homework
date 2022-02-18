package com.example.demo.entity.order37;

import com.example.demo.service.order37.MemberServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class LoginPage {
    public static MemberServiceImpl dbMember;



    public LoginPage(){
        dbMember = new MemberServiceImpl();
    }

    public static void compare(MemberLogin memberLogin) {
        for(Member list : dbMember.list()){

        }
    }
}
