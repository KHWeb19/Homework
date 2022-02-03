package com.example.demo.controller29HW;

import com.example.demo.entity.order29.Area.Area;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/bank9_3")
public class Bank9_3 {
    @GetMapping("/main")
    public String main (){
        log.info("main()");

        return "29thHW/area/main";
    }

    @PostMapping("/triangle")
    public String triangle(Model model) {
        log.info("triangle()");
        Area area = new Area(1,7);

        model.addAttribute("triangle",area.getTriangleNum());
        return "29thHW/area/triangle";
    }

    @PostMapping("/square")
    public String square(Model model) {
        log.info("square()");
        Area area = new Area(2,6);

        model.addAttribute("square",area.getSquare());
        return "29thHW/area/square";
    }

    @PostMapping("/hexagon")
    public String hexagon(Model model) {
        log.info("hexagon()");
        Area area = new Area(3,12);

        model.addAttribute("hexagon",area.getHexagon());
        return "29thHW/area/hexagon";
    }
}
