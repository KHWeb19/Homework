package com.example.demo.entity.order29;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/29th/member")
public class  Member{

    @ResponseBody
    @GetMapping("/view-info")
    public Member viewInfo () {
        log.info("viewInfo()");

        Member member = new Member();

        return member;//post는 json을 본다

    }
}


