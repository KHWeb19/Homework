package com.example.demo.controller.proBank12;


import com.example.demo.entity.proBank11.User;
import com.example.demo.entity.proBank12.Student;
import com.example.demo.service.proBank12.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/12th/student")
public class ProBank12Controller {

    @Autowired
    private StudentService studentService;


    @GetMapping("/register")
    public String scoreRegister (Student student) {
        log.info("scoreRegister");

        return "/12th/student/scoreRegister";
    }

    //개선점
    //모델 여러번 쓰는것보다
    //각 평균 데이터 값을 db로 저장해서 사용하는게 깔끔하려나

    @PostMapping("/register")
    public String register(Student student, Model model){
        log.info("registerForm");

        studentService.register(student);



        return "12th/student/average";
    }

    @GetMapping("/checkAvgAll")
    public String checkAvgAll (Model model) {
        log.info("checkAvgAll");


        model.addAttribute("classAvg", studentService.classAvg());
        model.addAttribute("koreanAvg", studentService.koreanAvg());
        model.addAttribute("englishAvg", studentService.englishAvg());
        model.addAttribute("mathAvg", studentService.mathAvg());

        return "/12th/student/checkAvgAll";
    }

    @GetMapping("/scoreList")
    public String scoreList (Model model) {
        log.info("scoreList");

        model.addAttribute("list" , studentService.list());


        return "/12th/student/scoreList";
    }

}
