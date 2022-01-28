package com.example.demo.controller.order28th;

import com.example.demo.utility.Dice;
import com.example.demo.utility.school.SchoolClass;
import com.example.demo.utility.series.KindsOfSequence;
import com.example.demo.utility.series.MySequence;
import com.example.demo.utility.thread.ThreadWorker;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/28th")
public class Bank8Dash28thController {
    //private final static Logger logger = LoggerFactory.getLogger(Bank8Dash28thController.class);

    @RequestMapping("/homework1")
    public String Homework1(Model model) {
        log.info("client entered / homework1");

        MySequence sequence = new MySequence(2, KindsOfSequence.GEOMETRIC);
        sequence.calcSequenceOrder(31);
        model.addAttribute("sequence", sequence.getResult());
        return "28th/homework1";
    }

    @RequestMapping("/homework2")
    public String Homework2(Model model) {
        log.info("client entered / homework2");
        
        // 입력장치에 접근하는게 두개가 되기때문에
        // scanner는 thread로 구현해야한다.
        // 웹 사이트에 출력, 콘솔에 출력 -> 두개 다 출력이기 떄문.

        SchoolClass sc = new SchoolClass(30,80);
        sc.doEnglishExam();
        sc.calcClassMean();

        model.addAttribute("classMean", sc.getClassMean());
        // ThreadWorker.getSyncLockTest() 가 Critical Section인 이유는?
        // -> main에서도 Thread로 구현되어있기 때문에 둘다 Thread라서..?

        return "28th/homework2";
    }

}
