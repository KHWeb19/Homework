package com.example.demo.service.order32;

import com.example.demo.entity.order32.Member;

import java.util.List;

public interface MemberService {
    public void register (Member member);
    public List<Member> list ();
    public Member read (Integer memberNo);
    public void modify (Member member);
    public void remove (Integer memberNo);
}
