package com.example.demo.controller.homework;

import com.example.demo.utility.area.areaKind;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("homework3/board")
public class Bank9_3 {

    areaKind area = new areaKind(2);

    @GetMapping("/main")
    public String boardMain() {
        log.info("boardMain()");

        return "homework3/board/main";
    }

    @GetMapping("/triangleGet")
    public String triangleGet(Model model) {
        log.info("triangleGet()");
        model.addAttribute("triangle", area.Triangle());
        return "homework3/board/triangleGet";
    }

    @GetMapping("/squareGet")
    public String squareGet(Model model) {
        log.info("squareGet()");
        model.addAttribute("square", area.Square());
        return "homework3/board/squareGet";
    }

    @GetMapping("/hexagonGet")
    public String hexagonGet(Model model) {
        log.info("hexagonGet()");
        model.addAttribute("hexagon", area.Hexagon());
        return "homework3/board/hexagonGet";
    }
}