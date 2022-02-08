package com.example.demo.controller;

import com.example.demo.utility.MyCustomSequence;
import com.example.demo.utility.Score;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Scanner;

@Controller
public class Bank8_26thController {

    private final static Logger logger = LoggerFactory.getLogger(Bank8_26thController.class);

   @RequestMapping("/homework1")
    public String p1 (Model model){
       logger.info("client entered /homework1");
        //localhost:8080/homework1 로 접속하면
       // 사용자 입력을 통해 값을 구하고 싶은 항을 inputNum에 대입

       Scanner scan = new Scanner(System.in);
       System.out.println("geometric sequence[common ratio = 2] ");
       System.out.print("which term of the geometric sequence?(1~n) : ");
       int inputNum = scan.nextInt();

       MyCustomSequence mcs = new MyCustomSequence(2,inputNum);
       model.addAttribute("sequenceNum",mcs.setSequenceNum());

       return "26th/homework1";
   }

    @RequestMapping("/homework2")
    public String p2 (Model model){
        logger.info("client entered /homework2");

        Score sc = new Score();
        model.addAttribute("averageScore",sc.calcAverage());

        return "26th/homework2";

    }

}
