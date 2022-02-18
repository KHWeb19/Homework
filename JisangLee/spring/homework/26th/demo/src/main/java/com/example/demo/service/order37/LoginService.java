package com.example.demo.service.order37;

import com.example.demo.entity.order37.MemberManagementSystem;
import com.example.demo.repository.order37.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    @Autowired
    private final MemberRepository memberRepository;


    public boolean login(MemberManagementSystem memberManagementSystem) {

        //MemberManagementSystem MemberManagementSystem = memberRepository.read(memberManagementSystem.getMemberNo());

        String id = memberManagementSystem.getId();
        String password = memberManagementSystem.getPassword();
        //MemberManagementSystem findMemberManagementSystem = memberRepository.create(memberManagementSystem);
        //System.out.printf("id = %s\n", id);
        //System.out.printf("password = %s\n", password);
        System.out.printf("ID = %s\n", memberManagementSystem.getId());
        System.out.printf("PW = %s\n",memberManagementSystem.getPassword());
        if (id == null) {
            return false;
        }
        //System.out.printf("id = %s\n", findMemberManagementSystem);
        if (password.equals(memberManagementSystem.getPassword())){
            return false;
        }
        //System.out.printf("password = %s\n",findMemberManagementSystem.getPassword());
        return true;
    }
}





