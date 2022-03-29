package com.example.demo.controller.order39;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/39th/js")
public class Repeat39thJsController {

    @GetMapping("/BoolTest")
    public String BoolTest () {
        log.info("BoolTest()");

        return "/39th/js/BoolTest";
    }

}
