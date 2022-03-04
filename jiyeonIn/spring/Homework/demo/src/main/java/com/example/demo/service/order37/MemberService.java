package com.example.demo.service.order37;


import com.example.demo.entity.order37.Member;

import java.util.List;

public interface MemberService {
    public void register(Member member);
    public List<Member> list();
    public void modify(Member member);
    public void remove(Integer memberNo);
    public Member read(Integer memberNo);
    public Integer loginCheck(Member member);

}
