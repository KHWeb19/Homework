package com.example.demo.controller;


import com.example.demo.utility.proBank9.Lotto;
import com.example.demo.utility.proBank9.Lotto2;
import com.example.demo.utility.proBank9.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Slf4j
@RestController
@RequestMapping("/27th")
public class ProBank9Controller {

    @GetMapping("/homework1")
    public String clientConnect(){
        log.info("check");

        return "27th/homework1";
    }


   @PostMapping("/recommend")
    //public String todayRecommend(Model model) {
    //public Product todayRecommend() {
    public void todayRecommend(Model model) {
        log.info("recommend");

        Product s = new Product();

        model.addAttribute("s" , s);

        //return "27th/recommend";
        //return s;
    }

    //배열화 된걸 웹상에 출력을 못하겠음
    //Collection을 사용해야되는건가싶은데
    //그럼 애초에 유틸리티에 만든것에 List나 Map을 활용하면 되는것인지도 모르겠음
    @GetMapping("/lotto")
    public Lotto lottoDrawing(Model model){
        log.info("drawing");

        Lotto lot = new Lotto(100,5);
        lot.allocPeopleNumber();
        lot.raffle();

        return lot;


    }


    @GetMapping("/lotto2")
    public Map<Integer, Integer> draw() {
        log.info("ss");

        Lotto2 lot2 = new Lotto2();

        return lot2.people();


    }

}
