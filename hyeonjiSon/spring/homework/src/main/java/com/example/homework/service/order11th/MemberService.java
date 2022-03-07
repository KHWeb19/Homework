package com.example.homework.service.order11th;

import com.example.homework.entity.order11th.Member;

import java.util.List;

public interface MemberService {
    public void join (Member member);
    public Boolean login(Member member); //아이디랑 비밀번호 다 받아야 하니까
    public List<Member> list ();
    public Member read(Integer memberNo);
    public void modify (Member member);
    public void remove (Integer memberNo);
}

//6. 로그인 기능 (id, pw 입력해서 일치하면 Boolean 리턴해서 체크하도록 한다)