package com.example.demo.controller.Bank12;

import com.example.demo.entity.Bank12.GradeManage;
import com.example.demo.service.Bank12.GradeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/Bank12/board")
public class Bank12Controller {

    @Autowired
    private GradeService gradeService;

    @GetMapping("/register")
    public String registerForm(GradeManage gradeManage){
        log.info("registerForm");

        return "/Bank12/board/register";
    }

    @PostMapping("/register")
    public String register(GradeManage gradeManage, Model model) {
        log.info("register()");

        gradeService.register(gradeManage);

        return "Bank12/board/success";
    }

    @GetMapping("/list")
    public String list(Model model) {
        log.info("list()");

        model.addAttribute("list",gradeService.list());

        return "Bank12/board/list";
    }

    @GetMapping("/read")
    public String read(int studentNo, Model model) {
        log.info("read()");

        model.addAttribute(gradeService.read(studentNo));

        return "Bank12/board/read";
    }

    @GetMapping("/modify")
    public String modifyForm(int studentNo, Model model) {
        log.info("modifyForm()");

        model.addAttribute(gradeService.read(studentNo));

        return "Bank12/board/modify";
    }

    @PostMapping("/modify")
    public String modify(GradeManage gradeManage, Model model) {
        log.info("modify()");

        gradeService.modify(gradeManage);

        return "Bank12/board/success";
    }

    @PostMapping ("/remove")
    public String remove(int gradeNo, Model model) {
        log.info("remove()");

        gradeService.remove(gradeNo);

        return "Bank12/board/success";
    }
}
