package com.example.homework.controller;

import com.example.homework.utility.Power;
import com.example.homework.utility.school.Score;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/8th")
public class Bank8Controller {

    private final static Logger logger = LoggerFactory.getLogger(Bank8Controller.class);

    //homework1,2로 표시해도 문제 없겠지만 혹시 꼬일까봐 걱정되니까 3으로 표시하자
    @RequestMapping("/homework3")
    public String bank8Homework1(Model model){
        logger.info("client entered/homework3");
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

    @RequestMapping("/homework4")
    public String bank8Homework2(Model model){
        logger.info("client entered/homework4");

        //학생 30명의 영어 시험 점수 평균값을 구해라.
        //단, 학생들의 점수는 60점 이하가 없다.
        Score score = new Score(30, 60);
        //학생 수를 매개변수로 넣을 수 있도록 만들자.

        model.addAttribute("average", score.getAverage());

        return "8th/homework4";
    }

}
