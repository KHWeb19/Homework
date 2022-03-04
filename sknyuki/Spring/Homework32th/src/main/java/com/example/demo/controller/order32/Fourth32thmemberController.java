package com.example.demo.controller.order32;

import com.example.demo.entity.order32.Member;
import com.example.demo.service.order32.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/32th/member")
public class Fourth32thmemberController {

    @Autowired
    private MemberService memberService;


    @GetMapping("/register")

    public String registerForm () {

        log.info("registerForm");


        return "/32th/member/register";
    }


    @PostMapping("/register")
    public String register (Member member, Model model) {
        log.info("DB register - member 정보: " + member);


        memberService.register(member);


        return "/32th/member/success";
    }

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list");


        model.addAttribute("list", memberService.list());


        return "/32th/member/list";
    }


    @GetMapping("/read")
    public String read (int memberNo, Model model) {
        log.info("read");


        model.addAttribute(memberService.read(memberNo));

        return "/32th/member/read";
    }


    @GetMapping("/modify")
    public String modifyForm (int memberNo, Model model) {
        log.info("modifyForm");


        model.addAttribute(memberService.read(memberNo));


        return "/32th/member/modify";
    }


    @PostMapping("/modify")
    public String modify (Member member, Model model) {
        log.info("modify");


        memberService.modify(member);


        return "/32th/member/success";
    }


    @PostMapping("/remove")
    public String remove (int memberNo, Model model) {
        log.info("remove");


        memberService.remove(memberNo);


        return "/32th/member/success";
    }
}
