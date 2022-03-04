package com.example.demo.service.hw;


import com.example.demo.entity.hw.Member;
import com.example.demo.repository.hw.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository repository;

    @Override
    public void register(Member member) {repository.create(member);}

    @Override
    public List<Member> list() { return repository.list();}

    @Override
    public Member read (Integer memberNo) { return repository.read(memberNo);}

    @Override
    public void modify (Member member) {repository.update(member);}

    @Override
    public void withdrawal(Integer memberNo) {repository.delete(memberNo);}

    @Override
    public void login (String id, String password) {repository.login(id, password);}
}
