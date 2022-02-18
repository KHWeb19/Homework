package com.example.bank.controller.bank11;

import com.example.bank.entity.bank11.User;
import com.example.bank.service.bank11.UserService;
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
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list check");

        model.addAttribute("list", userService.list());
        return "/bank11/list";
    }

    @GetMapping("/signUp")
    public String signUpForm (User user) {
        log.info("signUpForm check");

        return "/bank11/signUp";
    }

    @PostMapping("/signUp")
    public String signUp (User user) {
        log.info("signUp check");

        userService.signUp(user);
        return "/bank11/success";
    }

    @GetMapping("/read")
    public String read (int userNo, Model model) {
        log.info("read check");

        model.addAttribute(userService.read(userNo));
        return "/bank11/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int userNo, Model model) {
        log.info("modifyForm check");

        model.addAttribute(userService.read(userNo));
        return "/bank11/modify";
    }

    @PostMapping("/modify")
    public String modify (User user) {
        log.info("modify check");

        userService.modify(user);
        return "/bank11/success";
    }

    @PostMapping("/remove")
    public String remove (int userNo) {
        log.info("remove check");

        userService.remove(userNo);
        return "/bank11/success";
    }

    @GetMapping("/signIn")
    public String signInForm () {
        log.info("signIn check");

        return "/bank11/signIn";
    }

    @PostMapping("/signIn")
    public String signIn (User user) {
        log.info("signIn check");

        if(userService.signIn(user)){
            return "/bank11/success";
        }
        return "/bank11/signInFail";
    }
}
