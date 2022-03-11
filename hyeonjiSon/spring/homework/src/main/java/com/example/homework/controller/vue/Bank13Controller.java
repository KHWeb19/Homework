package com.example.homework.controller.vue;

import com.example.homework.entity.order10th.Market;
import com.example.homework.service.order10th.MarketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/13th/market")
public class Bank13Controller {

    @Autowired
    private MarketService service;

    @GetMapping("/{marketNo}")
    public ResponseEntity<Market> g

}
