package com.example.demo.controller.order29;

import com.example.demo.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/29th/member")
public class Second29thMemberController {

    // ResponseBody는 post로 만듦
    // post타입은 모두 Json 형식
    // Json과 Stirng을 구별해야한다.
    // Json은 데이터 자체를 의미. String은 데이터를 어떻게 문자열로 보일 것인가?

    @ResponseBody
    @GetMapping("/view-info")
    public Member viewInfo () {
        log.info("viewInfo()");

        Member member = new Member();
        log.info("member: " + member);

        return member;
    }
}
