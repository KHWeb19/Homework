package com.example.demo.controller.homework;

import com.example.demo.utility.lottery.lottery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("homework2")
public class Bank9_2 {
    public static void main(String[] args) {
        lottery lotto = new lottery();
        lotto.lottoX();


       /* @GetMapping("/randomlotto")
        public String randomlotto(Model model) {
            log.info("randomlotto()");
            model.addAttribute("randomlotto", area.Triangle());
            return "homework3/board/triangleGet";
        }*/
    }
}
