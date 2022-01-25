package com.example.demo.bank7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class classHomeWork1 {
    private static final Logger logger = LoggerFactory.getLogger(classHomeWork1.class);
    int range=6;

    @RequestMapping("/homeWork1")
    public String homeWork1(Model model) {
        logger.info("client entered /homeWork1");

        int diceNum =(int)((Math.random()*range)+1);

        model.addAttribute("number", diceNum);

        return "homeWorkBank7/homeWork1";
    }
    @RequestMapping("/homeWork2")
    public String homeWork2(Model model) {
        logger.info("client entered /homeWork2");
        //파라미터 없이 3초마다 증진 시키는 값이므로 while(true)루프로 무한 루프를 돌린다.
        //Thread.sleep로 3초간 딜레이시키고
        //딜레이 시킨후 변수 text의 값을 1 증진시킴

        //강사님 힌트: lock으로 묶어준다?
        //critical section은?
        //Thread가 여러개가 필요한가?
    int text=0;
        try{
            while(true) {//3초마다 text의 값을 증진시킴 실행이 안됨..
                Thread.sleep(3000);
                text++;
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        model.addAttribute("number",text);

        return "homeWorkBank7/homeWork2";
    }
}