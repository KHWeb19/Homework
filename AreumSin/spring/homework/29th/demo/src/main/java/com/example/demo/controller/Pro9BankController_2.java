package com.example.demo.controller;

import com.example.demo.utility.Prob2.Lotto;
import com.example.demo.utility.prob1.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Slf4j
@Controller
@RequestMapping("/homework2")
public class Pro9BankController_2 {

    @ResponseBody
    @GetMapping("/lotto")
    public Map<Integer, String> main () {
        log.info("lotto");

        Map<Integer, String> resultLotto = new HashMap<>();
        Lotto lotto = new Lotto(20, 5);
        lotto.peopleMember();
        lotto.raffle();

        for(int i = 0; i < 20; i++){
            resultLotto.put(lotto.checkNum(i), lotto.checkWin(i));
        }

        return resultLotto;
    }

}

