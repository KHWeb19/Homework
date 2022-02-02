package com.example.demo.controller;
import com.example.demo.entity.P02.Lotto;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/lotto")
public class P02Controller {

    @GetMapping("/viewLotto")
    //public Lotto showSelectedProduct(){
    public String[] showSelectedProduct(){
        log.info("viewLotto()");

        Lotto myLotto = new Lotto(100,5);
        myLotto.raffle();
        log.info("Lotto: "+myLotto);

        //return myLotto;
       return myLotto.getResultArr();
    }

}
