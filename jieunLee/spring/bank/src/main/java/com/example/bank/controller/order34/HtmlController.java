package com.example.bank.controller.order34;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/html")
public class HtmlController {

    @GetMapping("/liTag")
    public String liTag() {
        log.info("liTag check");

        return "32th/html/liTag";
    }

    @GetMapping("/font")
    public String font() {
        log.info("font check");

        return "32th/html/font";
    }

    @GetMapping("/table")
    public String table() {
        log.info("table check");

        return "32th/html/table";
    }
}
