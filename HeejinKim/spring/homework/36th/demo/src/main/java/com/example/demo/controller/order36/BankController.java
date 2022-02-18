package com.example.demo.controller.order36;

import com.example.demo.entity.BankBoard;
import com.example.demo.service.BankBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/bank/page")
public class BankController {

    @Autowired
    private BankBoardService bankBoardService;

    @GetMapping("/list")
    public String list (Model model){
        log.info("list");

        model.addAttribute("list",bankBoardService.list());

        return "/bank/list";
    }

    @GetMapping("/register")
    public String registerForm (BankBoard bankBoard){
        log.info("registerForm");

        return "/bank/register";
    }

    @PostMapping("/register")
    public String register (BankBoard bankBoard, Model model) {
        log.info("DB register - bankBoard 정보: " + bankBoard);

        bankBoardService.register(bankBoard);

        return "/bank/success";
    }

    @GetMapping("/read")
    public String read (int memberNo, Model model) {
        log.info("read");


        model.addAttribute(bankBoardService.read(memberNo));

        return "/bank/read";
    }


    @GetMapping("/modify")
    public String modifyForm (int memberNo, Model model) {
        log.info("modifyForm");

        model.addAttribute(bankBoardService.read(memberNo));

        return "/bank/modify";
    }


    @PostMapping("/modify")
    public String modify (BankBoard bankBoard, Model model) {
        log.info("modify");

        bankBoardService.modify(bankBoard);

        return "/bank/success";
    }

    @PostMapping("/remove")
    public String remove (int memberNo, Model model) {
        log.info("remove");

        bankBoardService.remove(memberNo);


        return "/bank/success";
    }
}
