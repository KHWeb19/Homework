package com.example.demo.controller.order32;

import com.example.demo.entity.order32.ProductBoard;
import com.example.demo.service.order32.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/32th/productBoard")
public class Bank10n32thController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/register")

    public String registerForm (ProductBoard productBoard){
        log.info("registerForm");

        return "/32th/productBoard/register";
    }

    @PostMapping("/register")
    public String register(ProductBoard productBoard, Model model){
        log.info("DB register - productBoard 정보: " + productBoard);

        boardService.register(productBoard);

        return "/32th/productBoard/success";

    }

    @GetMapping("/list")
    public String list (Model model){
        log.info("list");

        model.addAttribute("list", boardService.list());
        return "/32th/productBoard/list";
    }

    @GetMapping("/read")
    public String read (int boardNo, Model model){
        log.info("read");

        model.addAttribute(boardService.read(boardNo));

        return "/32th/productBoard/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int boardNo, Model model){
        log.info("modifyForm");

        model.addAttribute(boardService.read(boardNo));

        return "32th/productBoard/modify";
    }

    @PostMapping("/modify")
    public String modify (ProductBoard productBoard, Model model){
        log.info("modify");

        boardService.modify(productBoard);

        return "32th/productBoard/success";
    }

    @PostMapping("/remove")
    public String remove (int boardNo, Model model){
        log.info("remove");

        boardService.remove(boardNo);

        return "32th/productBoard/success";
    }
}
