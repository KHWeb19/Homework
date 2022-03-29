package com.example.homework.service.order11th;

import com.example.homework.entity.order11th.Member;
import com.example.homework.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository repository;

    @Override
    public void join(Member member) {
        repository.create(member);
    }

    @Override
    public Boolean login(Member member) {
        // 특정 id 값을 가지고 있는지 검사
        Member findMember = repository.findMemberById(member);

        // 해당 id 값의 pw가 일치하는지 확인
        //findMemberById를 통해 DB에 저장된 Pw값이 입력된 Pw값과 일치하는지 문자열 비교
                                                      // equals <-------------

        Boolean loginSuccess = findMember.getPw().equals(member.getPw());

        // 모두 OK라면 true 리턴
        // 도중에 하나라도 문제가 발생한다면 false 리턴
        return loginSuccess;
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
        repository.remove(memberNo);

    }
}
