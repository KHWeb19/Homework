package com.example.demo.controller;

import com.example.demo.entity.P03.CalcArea;
import com.example.demo.entity.P03.RegularPolygon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/regularPolygon")
public class P03Controller {

    @GetMapping("/main")
    public String shopMain() {
        log.info("regularPolygonMain()");
        return "/regularPolygon/main";
    }

    //POST
    @ResponseBody
    @PostMapping("/getTriangleArea")
    public CalcArea getTriangleArea() {
        log.info("getTriangleArea()");

        CalcArea cta = new CalcArea(RegularPolygon.TRIANGLE,3);
        cta.getArea();
        log.info("regularPolygon: " + cta);

        return cta;
    }

    @ResponseBody
    @PostMapping("/getSquareArea")
    public CalcArea getSquareArea() {
        log.info("getSquareArea()");

        CalcArea csa = new CalcArea(RegularPolygon.SQUARE,3);
        csa.getArea();
        log.info("regularPolygon: " + csa);

        return csa;
    }

    @ResponseBody
    @PostMapping("/getHexagonArea")
    public CalcArea getHexagonArea() {
        log.info("getHexagonArea()");

        CalcArea cha = new CalcArea(RegularPolygon.HEXAGON,3);
        cha.getArea();
        log.info("regularPolygon: " + cha);

        return cha;
    }
}