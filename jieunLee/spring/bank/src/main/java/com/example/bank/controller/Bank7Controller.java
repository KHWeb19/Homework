package com.example.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank7Controller implements Runnable {

    //요청하면 랜덤값 생성
    @RequestMapping("/homework1")
    public String homework1 (Model model) {
        int rand = (int)(Math.random()*6+1);
        model.addAttribute("dice", rand);
        return "bank7/homework1";
    }

    //값이 유지되어야하니까 전역변수로
    static int test = 0;
    //url 요청하기전부터 이 메서드가 실행되고있어야함
    public void run() {
        try {
            while(true) {
                Thread.sleep(3000);
                test++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //요청전 test는 계속 증가하고있음
    //요청후 현재의 값을 출력해야함
    @RequestMapping("/homework2")
    public String homework2 (Model model) {
        model.addAttribute("test", test);
        return "bank7/homework2";
    }
}
