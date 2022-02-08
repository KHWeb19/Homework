package com.example.demo.controller;


import com.example.demo.utility.proBank9.Lotto;
import com.example.demo.utility.proBank9.Product;
import com.example.demo.utility.proBank9.response.LottoResponse;
import com.example.demo.utility.proBank9.response.ProductResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Slf4j
@Controller
@RequestMapping("/27th")
public class ProBank9Controller {

    @GetMapping("/homework1")
    public String clientConnect(){
        log.info("check");

        return "27th/homework1";
    }

    @ResponseBody
    @PostMapping("/recommend")
    public ProductResponse todayRecommend(Model model) {
        log.info("recommend");

        Product s = new Product(3,5);

        ProductResponse pr = new ProductResponse(s);

        return pr;

    }

    @ResponseBody
    @PostMapping("/lotto")
    public LottoResponse lottoDrawing(Model model){
        log.info("drawing");

        Lotto lot = new Lotto(100,5);
        lot.raffle2();

        LottoResponse lr = new LottoResponse(lot);

        return lr;



    }

}

