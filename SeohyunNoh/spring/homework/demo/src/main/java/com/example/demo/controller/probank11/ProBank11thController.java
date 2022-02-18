package com.example.demo.controller.probank11;

import com.example.demo.entity.probank11.MemberManage;
import com.example.demo.service.probank11.MemberService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/11th")
public class ProBank11thController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/register")
    public String registerForm(MemberManage memberManage){
        log.info("registerForm");

        return "/11th/register";
    }

    @PostMapping("/register")
    public String register(MemberManage memberManage, Model model){
        log.info("register");

        memberService.register(memberManage);

        return "/11th/success";
    }

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list");

        model.addAttribute("list", memberService.list());

        return "/11th/list";
    }

    @GetMapping("/read")
    public String read (int memberNo, Model model) {
        log.info("read");

        model.addAttribute(memberService.read(memberNo));

        return "/11th/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int memberNo, Model model) {
        log.info("modify");

        model.addAttribute(memberService.read(memberNo));

        return "/11th/modify";
    }

    @PostMapping("/modify")
    public String modify (MemberManage memberManage) {
        log.info("modify");

       memberService.modify(memberManage);

        return "/11th/success";
    }

    @PostMapping("/remove")
    public String remove (int memberNo, Model model) {
        log.info("remove");

        memberService.remove(memberNo);

        return "/11th/success";
    }
}
