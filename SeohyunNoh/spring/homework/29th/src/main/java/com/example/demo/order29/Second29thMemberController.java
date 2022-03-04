package com.example.demo.order29;

import com.example.demo.entity.order29.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/29th/member")
public class Second29thMemberController {

    // @ResponseBody : 리턴하는 객체를 JSON형태로 보이게 함
    // post는 JSON을 보게 한다
    // 아래 로직 부연설명
    // GetMapping으로 URL요청을 처리하고 -> JSON타입으로 객체를 post로 리턴
    @ResponseBody
    @GetMapping("/view-info")
    public Member viewInfo(){
        log.info("viewInfo()");

        Member member = new Member();

        log.info("member" + member);

        return member;
    }
}
