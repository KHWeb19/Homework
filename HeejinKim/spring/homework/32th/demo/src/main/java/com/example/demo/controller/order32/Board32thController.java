package com.example.demo.controller.order32;

import com.example.demo.entity.order32.Board;
import com.example.demo.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/32th/play")
public class Board32thController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/register")
    public String registerForm(Board board, Model model){
        log.info("registerForm");

        return "/32th/register";
    }

    @GetMapping("/list")
    public String list (Model model){
        log.info("list");

        model.addAttribute("list",boardService.list());

        return "/32th/list";
    }


}
