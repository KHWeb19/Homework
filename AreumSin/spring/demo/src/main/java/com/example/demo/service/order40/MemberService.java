package com.example.demo.service.order40;

import com.example.demo.entity.order36.ProductBoard;
import com.example.demo.entity.order40.Member;

import java.util.List;

public interface MemberService {
    public void register (Member member);
    public List<Member> list ();
    public Member read (Integer memberNo);
    public void modify (Member Member);
    public void remove (Integer productNo);
    public boolean login(Member member);
}
