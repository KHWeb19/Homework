package com.example.demo.controller;


import com.example.demo.entity.bankNum1.ProductBank;
import com.example.demo.entity.num2.Lotto;
import com.example.demo.entity.num2.LottoPlay;
import com.example.demo.entity.num3.Area;
import com.example.demo.entity.num3.AreaPlay;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/30th")
public class Bank9Controller {

    @GetMapping("/Bank9")
    public String bank9(){

        log.info("get getbank9");

        return "homework/main";
    }


    @ResponseBody
    @PostMapping("/t1")
    public ProductBank postProduct(){
        log.info("post postProduct()");
        ProductBank pb= new ProductBank();

        return pb;
    }


    @ResponseBody
    @PostMapping("/t2")
    public LottoPlay postLotto(){

        log.info("post postLotto()");
        Lotto lt = new Lotto();
        lt.raffle(); //안 불러주면 값이 넣어지지가 않음

        LottoPlay lp = new LottoPlay(lt);

        return lp;
    }

    /*@ResponseBody
    @PostMapping("/t3tri")
    public AreaPlay postArea(){

        log.info("post post3tri()");
        Area area = new Area();

        AreaPlay ap = new AreaPlay();


        return ap;
    }

    @ResponseBody
    @PostMapping("/t3rect")
    public AreaPlay postArea(){

        log.info("post post3rect()");
        Area area = new Area();

        AreaPlay ap = new AreaPlay();


        return ap;
    }
    @ResponseBody
    @PostMapping("/t3hexa")
    public AreaPlay postArea(){

        log.info("post post3hexa()");
        Area area = new Area();

        AreaPlay ap = new AreaPlay();


        return ap;
    }*/






}



