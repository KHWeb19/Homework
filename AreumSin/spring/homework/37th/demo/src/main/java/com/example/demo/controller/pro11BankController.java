package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserManageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/user")
public class pro11BankController {

    @Autowired
    private UserManageService userManageService;

    @GetMapping("/login")
    public String loginForm(User user){
        log.info("loginForm()");

        return "/user/login";
    }

    @PostMapping("/login")
    public String login(User user){
        log.info("login()");
        boolean isCheck = userManageService.check(user);

        if(isCheck){ // 비워있을 경우 (로그인이 안될경우)
            System.out.println("111");
            return "/user/login_fail";
        }else {
            System.out.println("222");
            return "/user/success";
        }
    }

    @GetMapping("/list")
    public String list(Model model){
        log.info("/list");

        model.addAttribute("list", userManageService.list());

        return "/user/list";
    }

    @GetMapping("/register")
    public String registerForm(User user){
        log.info("registerForm()");

        return "/user/register";
    }

    @PostMapping("/register")
    public String register(User user){
        log.info("register()");

        userManageService.register(user);
        return "/user/success";
    }

    @GetMapping("/read")
    public String read(int userNo, Model model){
        log.info("read()");

        model.addAttribute(userManageService.read(userNo));

        return "/user/read";
    }

    @GetMapping("/modify")
    public String modifyForm(int userNo, Model model){
        log.info("modifyForm()");

        model.addAttribute(userManageService.read(userNo));

        return "/user/modify";
    }

    @PostMapping("/modify")
    public String modify(User user){
        log.info("modify()");

        userManageService.modify(user);

        return "/user/success";
    }

    @PostMapping("/remove")
    public String remove(int userNo){
        log.info("remove()");

        userManageService.remove(userNo);

        return "/user/success";
    }
}
