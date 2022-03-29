package com.example.demo.controller.Bank11;

import com.example.demo.entity.Bank11.MemberManage;
import com.example.demo.service.Bank11.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/Bank11/board")
public class Bank11Controller {

    @Autowired
    private MemberService memberService;

    @GetMapping("/main")
    public String main(){
        log.info("main()");

        return "/Bank11/board/main";
    }

    @GetMapping("/register")
    public String registerFrom(MemberManage memberManage) {
        log.info("registerFrom");

        return "/Bank11/board/register";
    }

    @PostMapping("/register")
    public String register(MemberManage memberManage, Model model) {
        log.info("register DB 처리: " + memberManage);

        memberService.register(memberManage);

        return "/Bank11/board/success";
    }

    @GetMapping("/list")
    public String list(Model model) {
        log.info("list");

        model.addAttribute("list",memberService.list());

        return "/Bank11/board/list";
    }

    @GetMapping("/read")
    public String read(int memberNo,Model model) {
        log.info("read");

        model.addAttribute(memberService.read(memberNo));

        return "/Bank11/board/read";
    }

    @GetMapping("/modify")
    public String modifyForm(int memberNo ,Model model) {
        log.info("modifyForm");

        model.addAttribute(memberService.read(memberNo));

        return "/Bank11/board/modify";
    }

    @PostMapping("/modify")
    public String modify(MemberManage memberManage ,Model model) {
        log.info("modify");

        memberService.modify(memberManage);

        return "/Bank11/board/success";
    }

    @PostMapping("/remove")
    public String remove(int memberNo ,Model model) {
        log.info("remove");

        memberService.remove(memberNo);

        return "/Bank11/board/success";
    }

    @GetMapping("/login")
    public String loginForm(MemberManage memberManage) {
        log.info("loginForm()");

        return "/Bank11/board/login";
    }

    @PostMapping("/login")
    public String login(MemberManage memberManage,Model model) {
        log.info("login()" + memberManage);


        System.out.println("Login res: " + memberService.login(memberManage));

        if (memberService.login(memberManage)==false){
            return "/Bank11/board/fail";
        }
        return "/Bank11/board/success";
    }
}
