package com.example.demo.controller;

import com.example.demo.entity.Score;
import com.example.demo.service.ScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/prob12")
public class Bank12Prob {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/list")
    public String list(Score score, Model model){
        log.info("list()");

        model.addAttribute("list", scoreService.list());
        model.addAttribute("list2", scoreService.listAvg());

        return "/prob12/list";
    }

    @GetMapping("/register")
    public String registerForm(Score score){
        log.info("registerForm()");

        return "/prob12/register";
    }

    @PostMapping("/register")
    public String register(Score score){
        log.info("register()");
        scoreService.register(score);
        return "/prob12/success";
    }

    @GetMapping("/read")
    public String read(Model model, int studentNo) {
        log.info("read()");

        model.addAttribute(scoreService.read(studentNo));

        return "/prob12/read";
    }

    @GetMapping("/modify")
    public String modifyForm(Model model, int studentNo){
        log.info("modifyForm()");

        model.addAttribute(scoreService.read(studentNo));

        return "/prob12/modify";
    }

    @PostMapping("/modify")
    public String modify(Score score){
        log.info("modify()");

        scoreService.update(score);

        return "/prob12/success";
    }

    @PostMapping("/remove")
    public String remove(int studentNo){
        log.info("remove()");

        scoreService.delete(studentNo);

        return "/prob12/success";
    }


}
