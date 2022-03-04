package com.example.demo.controller.Bank10;


import com.example.demo.entity.Bank10.Product;
import com.example.demo.service.Bank10.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/ex10/board")
public class testController {

    @Autowired
    private BoardService boardService;


    @GetMapping("/register")
    public String registerForm (Product product) {

        log.info("registerForm");

        return "/ex10/board/register";
    }

    @PostMapping("/register")
    public String register (Product product, Model model) {
        log.info("DB register - board 정보: " + product);

        boardService.register(product);

        return "/ex10/board/success";
    }

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list");

        model.addAttribute("list", boardService.list());

        return "/ex10/board/list";
    }

    // 33th
    // list에서 제목을 눌렀을 경우 연동됨
    @GetMapping("/read")
    public String read (int boardNo, Model model) {
        log.info("read");

        model.addAttribute(boardService.read(boardNo));

        return "/ex10/board/read";
    }

    // 33th
    // read에서 수정하기 눌렀을 경우 연동
    @GetMapping("/modify")
    public String modifyForm (int boardNo, Model model) {
        log.info("modifyForm");

        model.addAttribute(boardService.read(boardNo));

        return "/ex10/board/modify";
    }


    @PostMapping("/modify")
    public String modify (Product product, Model model) {
        log.info("modify");

        boardService.modify(product);

        return "/ex10/board/success";
    }

    @PostMapping("/remove")
    public String remove (int boardNo, Model model) {
        log.info("remove");

        boardService.remove(boardNo);

        return "/ex10/board/success";
    }
}
