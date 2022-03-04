package com.example.demo.controller.PB0902;

import com.example.demo.entity.PB0902.Lottery;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/PB0902")
public class LotteryController {

    @ResponseBody
    @GetMapping("/board")
    public Map<Integer, String> board(){
        log.info("board()");
        Lottery ml = new Lottery();

        return ml.getMyHashMap();

    }

}
