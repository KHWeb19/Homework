package com.example.demo.controller.order37;

import com.example.demo.entity.order37.MemberManagementSystem;
import com.example.demo.service.order37.MemberManagementSystemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/37th/member")
public class Bank11n37thController {

    @Autowired
    private MemberManagementSystemService memberManagementSystemService;

    @GetMapping("/join")
    public String joinForm (MemberManagementSystem memberManagementSystem){
        log.info("joinForm");

        return "/37th/member/join";
    }

    @PostMapping("/join")
    public String join(MemberManagementSystem memberManagementSystem, Model model){
        log.info("DB join - memberManagementSystem 정보: " + memberManagementSystem );

        memberManagementSystemService.join(memberManagementSystem);

        return "/37th/member/success";

    }

    @GetMapping("/list")
    public String list (Model model){
        log.info("list");

        model.addAttribute("list", memberManagementSystemService.list());
        return "/37th/member/list";
    }

    @GetMapping("/read")
    public String read (int memberNo, Model model){
        log.info("read");

        model.addAttribute(memberManagementSystemService.read(memberNo));

        return "/37th/member/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int memberNo, Model model){
        log.info("modifyForm");

        model.addAttribute(memberManagementSystemService.read(memberNo));

        return "/37th/member/modify";
    }

    @PostMapping("/modify")
    public String modify (MemberManagementSystem memberManagementSystem, Model model) {
        log.info("modify");

        memberManagementSystemService.modify(memberManagementSystem);

        return "/37th/member/success";
    }

    @PostMapping("/remove")
    public String remove (int memberNo, Model model){
        log.info("remove");

        memberManagementSystemService.remove(memberNo);

        return "/37th/member/success";
    }
}
