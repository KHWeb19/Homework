package com.example.demo.order30;

import com.example.demo.entity.order30.probank.EddiLotto;
import com.example.demo.entity.order30.probank.PolygonResponse;
import com.example.demo.entity.order30.probank.Product;
import com.example.demo.entity.order30.probank.RegularPolygon;
import com.example.demo.entity.order30.probank.response.LottoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/30th")
public class ThirdBank9ProController {

    @GetMapping("/prob")
    public String getBank9Prob(){
        log.info("get getBank9Prob()");

        return "30th/prob/prob";
    }

    @ResponseBody
    @PostMapping("/prob1")
    public Product getBank9Prob1(){
        log.info("post postBank9Prob1()");

        Product prod = new Product();

        return prod;
    }

    @ResponseBody
    @PostMapping("/prob2")
    public LottoResponse postBank9Pro2(){
        log.info("post postBank9Pro2()");

        EddiLotto el = new EddiLotto(100,5);
        el.raffle();

        LottoResponse lr = new LottoResponse(el);

        return lr;
    }

    @ResponseBody
    @PostMapping("/prob3tri")
    public PolygonResponse postBank9Pro3Triangle(){
        log.info("post postBank9Pro3Triangle()");

        RegularPolygon rp = new RegularPolygon(3);
        rp.calcTriangleArea();

        PolygonResponse pr = new PolygonResponse(rp);

        return pr;
    }

    @ResponseBody
    @PostMapping("/prob3rect")
    public PolygonResponse postBank9Pro3Rectangle(){
        log.info("post postBank9Pro3Rectangle()");

        RegularPolygon rp = new RegularPolygon(3);
        rp.calcRectangleArea();

        PolygonResponse pr = new PolygonResponse(rp);

        return pr;
    }

    @ResponseBody
    @PostMapping("/prob3hexa")
    public PolygonResponse postBank9Pro3Hexagon(){
        log.info("post postBank9Pro3Hexagon()");

        RegularPolygon rp = new RegularPolygon(3);
        rp.calcHexagonArea();

        PolygonResponse pr = new PolygonResponse(rp);

        return pr;
    }
}
