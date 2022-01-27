package com.example.homework.controller;

import com.example.homework.utility.Power;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class Bank8Controller {

    private final static Logger logger = LoggerFactory.getLogger(Bank8Controller.class);

    //homework1,2로 표시해도 문제 없겠지만 혹시 꼬일까봐 걱정되니까 3으로 표시하자
    @RequestMapping("/homework3")
    public String bank8Homework1(Model model){

        //extends Tread로 만들까 했는데
        // public void run을 만들어주니
        // 잘 돌아가던 ThreadWorker까지 에러가 발생하는 경우가 생기길래...
        //일단은 객체화만 사용하기로 함.
        Power power = new Power();
        power.calPower(2);
        //2 뿐만 아니라 어떤 숫자를 넣어도 거듭제곱이 가능하게 만들면 좋을 것 같음.

        model.addAttribute("powNum", power.getCalNum());

        return "8th/homework3";

    }
    //오류가 발생하진 않지만 Whitelabel Error page가 뜨면서 작동은 되지 않음...
}
