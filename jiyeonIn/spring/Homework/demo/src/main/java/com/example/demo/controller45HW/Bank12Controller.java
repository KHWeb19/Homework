package com.example.demo.controller45HW;

import com.example.demo.entity.order45.Student;
import com.example.demo.service.order45.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/bank12")
public class Bank12Controller {

    @Autowired
    private StudentService studentService;

    @GetMapping("/register")
    public String registerForm(Student student){
        log.info("registerForm");

        return "/45thHW/register";
    }

    @PostMapping("/register")
    public String register(Student student){
        log.info("registerPost");


        studentService.register(student);

        return "/45thHW/success";
    }

    @GetMapping("/list")
    public String list(Model model, Student student){
        log.info("list");

        model.addAttribute("list",studentService.list());
        model.addAttribute("in",studentService.list());

        return "/45thHW/list";
    }

    @GetMapping("/test")
    public String test(){
        log.info("list");

        return "/46thHW/sdsd";
    }
    @GetMapping("/test2")
    public String test2(){
        log.info("list");

        return "/46thHW/testt";
    }

}
