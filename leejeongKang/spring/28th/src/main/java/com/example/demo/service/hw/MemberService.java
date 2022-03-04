package com.example.demo.service.hw;

import com.example.demo.entity.hw.Member;

import java.util.List;

public interface MemberService {

    public void register (Member signup);
    public List<Member> list();
    public Member read (Integer memberNum);
    public void modify (Member signup);
    public void withdrawal (Integer memberNum);
    public void login (String Id, String password);

    }

