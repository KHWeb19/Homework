package com.example.bank.controller;

import com.example.bank.entity.Board;
import com.example.bank.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/32th/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/register")
    public String registerForm (Board board, Model model) {
        log.info("registerForm check");

        return "/32th/board/register";
    }

    @PostMapping("/register")
    public String register (Board board, Model model) {
        log.info("register check");

        boardService.register(board);
        return "/32th/board/register";
    }

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list check");

        model.addAttribute("list", boardService.list());

        return "/32th/board/list";
    }

    //민감한 정보가 없기에 post는 필요없음
    @GetMapping("/read")
    public String read (int boardNo, Model model) {
        log.info("read check");

        model.addAttribute(boardService.read(boardNo));
        return "/32th/board/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int boardNo, Model model) {
        log.info("modifyForm check");

        model.addAttribute(boardService.read(boardNo));
        return "/32th/board/modify";
    }

    @PostMapping("modify")
    public String modify (Board board, Model model) {
        log.info("modify check");

        boardService.modify(board);
        return "/32th/board/success";
    }

    @PostMapping("/remove")
    public String remove (int boardNo, Model model) {
        log.info("remove");

        boardService.remove(boardNo);
        return "/32th/board/success";
    }

}
