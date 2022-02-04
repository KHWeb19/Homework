package com.example.demo.controller;

import com.example.demo.utility.prob3.Hexagon;
import com.example.demo.utility.prob3.Rectangle;
import com.example.demo.utility.prob3.Triangle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/homework3")
public class Pro9BankController_3 {

    //@ResponseBody
    @GetMapping("/main")
    public String main () {
        log.info("main()");


        return "/homework3/main";
    }

    @ResponseBody
    @GetMapping("/triangle")
    public Triangle triangle () {
        log.info("triangle()");
        Triangle tri = new Triangle(5, 10);
        tri.TriangleSum();

        return tri;
    }

    @ResponseBody
    @GetMapping("/rectangle")
    public Rectangle rectangle () {
        log.info("rectangle()");
        Rectangle rect = new Rectangle(5, 34);
        rect.RectangleSum();

        return rect;
    }

    @ResponseBody
    @GetMapping("/hexagon")
    public Hexagon hexagon () {
        log.info("hexagon()");
        Hexagon hexagon = new Hexagon(1, 10);
        hexagon.SumHexagon();

        return hexagon;
    }
}

