package com.example.demo.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Quiz1 {

    public static final Logger Logger = LoggerFactory.getLogger(Quiz1.class);

    @RequestMapping("/homework1")
    public String dice(Model model){
        Logger.info("client entered /dice");
        
        int num = (int)(Math.random()*6)+1;
        
        model.addAttribute("diceNumber", num);

        return "25th/homework1";
//homework1 URL을 요청하면 주사위를 굴려서 주사위 값을 화면에 출력되게 만들어보자!
//  1.URL 주소를 homework1을 입력하면 나오게 설정
//  2.주사위 의 랜덤한 값을 출력하기 위해 랜덤 값을 뽑는 코드를 입력한다
//  3.주사위는 1~6까지의 수를 가지고 있으므로 1~6의 값을 출력
    }
    @RequestMapping("homework2")
    public String homework2(Model model) {
        Logger.info("client entered /testTimer");
//3초마다 test라는 변수의 값을 1씩 증가시키도록 한다.
//또한 homework2 URL을 요청하면 현재의 test값을 화면에 출력되게 만들어보자
// 1. URL 주소를 homework2을 입력하면 나오게 설정
// 2. test의 변수 값 지정
// 3. 3초당 1씩 증가 시키도록 지정 1씩 증가는 while문을 쓴다
// 4. 3초당을 Thread.sleep를 써서 3초의 시간을 준다.
        Timer tm = new Timer();
        tm.start();
//Inspection 'Loop statement that does not loop' options 오류로 반복문이 시작되지않음
//웹에서 1이라는 숫자만 출력됨
//스래드와 메소드를 이용해 출력 해봤지만 데이터가 출력이 안됌Run창에서 숫자가 입력됨
        model.addAttribute("testTimer", tm);
        return "25th/homework2";
    }
}


