package com.example.demo.service.order32;

import com.example.demo.entity.order32.Member;
import com.example.demo.repository.order32.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository repository;

    @Override
    public void register(Member member) {
        repository.create(member);
    }

    @Override
    public List<Member> list() {
        return repository.list();
    }

    @Override
    public Member read(Integer memberNo) {
        return repository.read(memberNo);
    }

    @Override
    public void modify(Member member) {
        repository.update(member);
    }

    @Override
    public void remove(Integer memberNo) {
        repository.delete(memberNo);
    }
}
