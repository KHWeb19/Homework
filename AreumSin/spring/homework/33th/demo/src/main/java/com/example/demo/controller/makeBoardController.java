package com.example.demo.controller;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/board")
public class makeBoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/register")
   public String registerForm (Board board) {
        log.info("registerForm");

        return "/board/register";
    }

    @PostMapping("/register")
    public String register(Board board){
        log.info("register()");
        boardService.register(board);
        return "/board/success";
    }


    @GetMapping("/list")
    public String list(Model model, Board board){
        log.info("list()");

        model.addAttribute("list" , boardService.list());
        return "/board/list";
    }
}
