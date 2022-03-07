package com.example.demo.controller.order41;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/41th/arrow")
public class ArrowFunctionController {

    @GetMapping("/jsArrow")
    public String getJsArrow () {
        log.info("jsArrow");

        return "/41th/arrow/jsArrow";
    }

}
