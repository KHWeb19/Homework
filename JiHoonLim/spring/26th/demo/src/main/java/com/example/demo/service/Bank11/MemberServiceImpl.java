package com.example.demo.service.Bank11;

import com.example.demo.entity.Bank11.MemberManage;
import com.example.demo.repository.Bank11.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberRepository repository;

    @Override
    public void register(MemberManage memberManage) {
        repository.create(memberManage);
    }

    @Override
    public List<MemberManage> list() {
        return repository.list();
    }

    @Override
    public MemberManage read(Integer memberNo) {
        return repository.read(memberNo);
    }

    @Override
    public void modify(MemberManage memberManage) {
        repository.update(memberManage);
    }

    @Override
    public void remove(Integer memberNo) {
        repository.delete(memberNo);
    }

    @Override
    public Boolean login(MemberManage memberManage) {
        // 특정 id 값을 가지고 있는지 검사
        // 해당 id 값의 pw가 일치하는지 확인
        // 모두 OK라면 true 리턴
        // 도중에 하나라도 문제가 발생한다면 false 리턴
        MemberManage findMember = repository.findMemberById(memberManage);

        if (findMember == null) {
            System.out.printf("There are no %s id\n", memberManage.getId());
            return false;
        }

        System.out.println("Check Password Only: " + findMember);
        Boolean loginSuccess = findMember.getPw().equals(memberManage.getPw());

        return loginSuccess;
    }
}
