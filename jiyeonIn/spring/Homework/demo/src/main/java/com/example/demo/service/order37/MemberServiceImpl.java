package com.example.demo.service.order37;

import com.example.demo.entity.order37.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberRepository repository;

    @Override
    public void register(Member member){
        repository.create(member);
    }

    @Override
    public List<Member> list() {
        return repository.list();
    }

    @Override
    public void modify(Member member) {
        repository.modify(member);
    }

    @Override
    public void remove(Integer memberNo) {
        repository.remove(memberNo);
    }

    @Override
    public Member read(Integer memberNo) {
        return repository.read(memberNo);
    }

    @Override
    public Integer loginCheck(Member member) {
        Member checkId = repository.findId(member);

        if(checkId == null){
            return 0;
        }else if (checkId.getPassword().equals(member.getPassword())){
            return 1;
        }else {
            return -1;
        }
    }
}
