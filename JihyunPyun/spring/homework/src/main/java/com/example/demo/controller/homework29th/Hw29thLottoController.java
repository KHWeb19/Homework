package com.example.demo.controller.homework29th;

import com.example.demo.entity.homework29th.Lotto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/29th")
public class Hw29thLottoController {
    @ResponseBody
    @GetMapping("/view-lotto")
    public Lotto viewLotto (){
        log.info("viewLotto()");
        Lotto lotto = new Lotto(5, 100);
        lotto.allocPlayerNumber();
        lotto.allocSelectNumber();
        lotto.allocPlayerArr();
        return lotto;
    }
}
