package com.example.demo.controller37HW;

import com.example.demo.entity.order37.Member;
import com.example.demo.service.order37.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/bank11")
public class Bank11Controller {

    @Autowired
    private MemberService memberService;

    @GetMapping("/main")
    public String main(){
        log.info("main");

        return "/37thHW/main";
    }

    @GetMapping("/register")
    public String registerForm(Member member){
        log.info("registerForm");

        return "/37thHW/register";
    }

    @GetMapping("/register2")
    public String registerForm2(Member member){
        log.info("registerForm");

        return "/37thHW/register2";
    }

    @PostMapping("/register")
    public String register(Member member){
        log.info("registerPost");

        memberService.register(member);
        return "/37thHW/success";
    }

    @PostMapping("/register2")
    public String register2(Member member){
        log.info("registerPost");

        memberService.register(member);
        return "/37thHW/success";
    }

    @GetMapping("/list")
    public String list(Model model){
        log.info("list");

        model.addAttribute("list",memberService.list());

        return "/37thHW/list";
    }

    @GetMapping("/read")
    public String read(int memberNo,Model model){
        log.info("read");

        model.addAttribute(memberService.read(memberNo));

        return "/37thHW/read";
    }

    @GetMapping("/modify")
    public String modifyForm(int memberNo, Model model){
        log.info("modifyForm");

        model.addAttribute(memberService.read(memberNo));

        return "/37thHW/modify";
    }

    @PostMapping("/modify")
    public String modifyPost(Member member){
        log.info("modifyPost");

        memberService.modify(member);

        return "/37thHW/success";
    }

    @PostMapping("/remove")
    public String remove(int memberNo, Model model){
        log.info("remove");

        memberService.remove(memberNo);

        return "/37thHW/success";
    }

    @GetMapping("/login")
    public String loginForm(Member member){
        log.info("loginForm");

        return "/37thHW/login";
    }

    @PostMapping("/login")
    public String login(Member member){
        log.info("login");

        if(memberService.loginCheck(member) == 1){
            return "/37thHW/successLogin";
        }else if(memberService.loginCheck(member) == 0){
            return "/37thHW/fail";
        }else
            return "/37thHW/fail1";
    }
}
