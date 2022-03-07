package com.example.demo.controller.order2;


import com.example.demo.entity.order2.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/29th/member")
public class PracticeResponseBody {


    @ResponseBody
    @GetMapping("/view-info")
    public Member viewInfo () {
        log.info("viewInfo()");

        Member member = new Member();
        log.info("member: " + member);

        return member;
    }
}

