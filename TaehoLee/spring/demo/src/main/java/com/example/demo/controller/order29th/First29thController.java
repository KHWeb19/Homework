package com.example.demo.controller.order29th;

import com.example.demo.utility.utility29th.Lottery.Lottery;
import com.example.demo.utility.utility29th.Polygon.Polygon;
import com.example.demo.utility.utility29th.Product.RndProduct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/29th")
public class First29thController {

    float selectPolygon;
    float length;

    @GetMapping("/")
    public String get29thmain(){
        log.info("get 29th_main");

        return "29th/main";
    }

    @ResponseBody
    @PostMapping("/homework1")
    public RndProduct posthomework1 () {
        log.info("post homework1()");

        RndProduct rndproduct = new RndProduct();

        return rndproduct;
    }

    @ResponseBody
    @PostMapping("/homework2")
    public Lottery posthomework2 () {
        log.info("post homework2()");

        Lottery lotto = new Lottery(5,60);
        lotto.drawLottery();

        return lotto;
    }

    @PostMapping("/homework3")
    public String homework3main () {
        log.info("post homework3()");

        return "29th/homework3/main";
    }

    @ResponseBody
    @PostMapping("/homework3/triangle")
    public Polygon homework3Triangle () {
        log.info("post homework3()_triangle");

        selectPolygon = 3;
        length = (int)(Math.random() * 10) + 1;

        Polygon triangle = new Polygon(selectPolygon, length);
        triangle.calcArea();

        return triangle;
    }

    @ResponseBody
    @PostMapping("/homework3/square")
    public Polygon homework3Square () {
        log.info("post homework3()_square");

        selectPolygon = 4;
        length = (int)(Math.random() * 10) + 1;

        Polygon square = new Polygon(selectPolygon, length);
        square.calcArea();

        return square;
    }

    @ResponseBody
    @PostMapping("/homework3/hexagon")
    public Polygon homework3Hexagon () {
        log.info("post homework3()_hexagon");

        selectPolygon = 6;
        length = (int)(Math.random() * 10) + 1;

        Polygon hexagon = new Polygon(selectPolygon, length);
        hexagon.calcArea();

        return hexagon;
    }

}
