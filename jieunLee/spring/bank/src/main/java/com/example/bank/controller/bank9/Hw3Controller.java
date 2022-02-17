package com.example.bank.controller.bank9;

import com.example.bank.utility.bank9.Area;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/bank9")
public class Hw3Controller {

    @GetMapping("/homework3")
    public String homework3 () {
        log.info("homework3 check");

        return "/bank9/homework3";
    }

    Area area = new Area(9);

    @ResponseBody
    @GetMapping("view-equTriangleArea")
    public Area viewEquTriangleArea () {
        log.info("viewEquTriangleArea check");

        //Area area = new Area(9);
        area.equTriangleArea();
        return area;
    }

    @ResponseBody
    @GetMapping("view-squareArea")
    public Area viewSquareArea () {
        log.info("viewSquareArea check");

        //Area area = new Area(9);
        area.squareArea();
        return area;
    }

    @ResponseBody
    @GetMapping("view-regHexagonArea")
    public Area viewRegHexagonArea () {
        log.info("viewRegHexagonArea check");

        //Area area = new Area(9);
        area.regHexagonArea();
        return area;
    }
}
