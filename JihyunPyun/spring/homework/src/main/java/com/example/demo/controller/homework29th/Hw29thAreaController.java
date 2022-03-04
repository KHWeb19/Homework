package com.example.demo.controller.homework29th;

import com.example.demo.utility.CalcArea;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/29th/calcArea")
public class Hw29thAreaController {
    @GetMapping("/main")
    public String main () {
        log.info("main");
        return "29th/calcArea/main";
    }

    @GetMapping("/triangleGet")
    public String triangleGet () {
        log.info("triangleGet()");

        return "29th/calcArea/triangleGet";
    }

    @GetMapping("/squareGet")
    public String squareGet () {
        log.info("squareGet()");
        return "29th/calcArea/squareGet";
    }

    @GetMapping("/hexagonGet")
    public String hexagonGet () {
        log.info("hexagonGet()");
        return "29th/calcArea/hexagonGet";
    }

}
