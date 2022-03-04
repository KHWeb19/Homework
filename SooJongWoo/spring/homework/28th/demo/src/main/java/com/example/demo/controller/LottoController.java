package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LottoController {

    private static final Logger logger = LoggerFactory.getLogger(LottoController.class);

    @RequestMapping("/29th/homework2")
    public String homework2 (Model model) {
        logger.info("client entered /test");

        final int TOTAL = 100;
        final int SELECT = 5;

        boolean[] lottoBox = new boolean[TOTAL];
        int[] selectIdx = new int[SELECT];

        boolean isRealloc = true;

        int lottoIdx = 0;

        for(int i = 0, allocCnt = 0; i < SELECT; i++) {
            while (isRealloc) {
                lottoIdx = (int) (Math.random() * TOTAL);

                isRealloc = false;

                for(int j = 0; j < allocCnt; j++) {
                    if (selectIdx[j] == lottoIdx) {
                        isRealloc = true;
                        break;
                    }
                }
            }

             lottoBox[lottoIdx] = true;
            selectIdx[allocCnt++] = lottoIdx;

            model.addAttribute("number", "lottoBox[" + lottoIdx + "] = " + lottoBox[lottoIdx]);

            isRealloc = true;

        }
        return "util/homework2";

    }
}
