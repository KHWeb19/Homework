package com.example.demo.controller.order37;

import com.example.demo.entity.order37.MemberManagementSystem;
import com.example.demo.service.order37.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/37th/member")
public class LoginController {

    @Autowired
    private final LoginService loginService;

    @GetMapping("/login")
    public String login() {
        log.info("login");
        return "/37th/member/login";
    }

    @PostMapping("/login")
    public String loginId(@ModelAttribute MemberManagementSystem memberManagementSystem) {
        log.info("loginTry");

        if (loginService.login(memberManagementSystem)) {

            System.out.println(loginService.login(memberManagementSystem));
            return "/37th/member/success";
        }
        return "/37th/member/login";
    }
}





