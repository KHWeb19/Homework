package com.example.demo.controller.order32;


import com.example.demo.service.order32.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/32th/board")
public class BoardController {

    @Autowired
    private BoardService boardService;


    @GetMapping("/list")
    public String list(Model model){
        log.info("list");

        model.addAttribute("list" , boardService.list());


        return "32th/board/list";
    }

    @GetMapping("/register")
    public String register(){
        log.info("register");


        return "32th/board/register";
    }


    //등록된 값을 DB로 넘겨줘야함
    @PostMapping("/register")
    public String registerDb(){
        log.info("registerDb");

        return "32th/board/success";
    }
}
