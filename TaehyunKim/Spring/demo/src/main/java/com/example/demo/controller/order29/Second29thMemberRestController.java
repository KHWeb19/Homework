package com.example.demo.controller.order29;

import com.example.demo.entity.order29.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/29th/member-rest")
public class Second29thMemberRestController {

    @GetMapping("/view-info")
    public Member viewInfo(){
        log.info("viewInfo()");

        Member member = new Member();
        log.info("member: " + member);


        return member;
    }
}
