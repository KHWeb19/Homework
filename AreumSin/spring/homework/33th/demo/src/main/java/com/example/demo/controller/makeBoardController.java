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

    @GetMapping("/read")
    public String read(int boardNo, Model model){
        log.info("read()");

        model.addAttribute( boardService.read(boardNo));
        return "/board/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int boardNo, Model model) {
        log.info("modifyForm");

        model.addAttribute(boardService.read(boardNo));

        // 수정 페이지 HTML (화면)
        return "/board/modify";
    }

    @PostMapping("/modify")
    public String modify(Model model, Board board){
        log.info("modify()");

        boardService.modify(board);
        return "/board/success";
    }


    @PostMapping("/remove")
    public String remove(int boardNo, Board board){
        log.info("remove()");

        boardService.remove(boardNo);

       return "/board/success";
    }
}
