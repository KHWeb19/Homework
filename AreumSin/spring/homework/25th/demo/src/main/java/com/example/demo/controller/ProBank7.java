package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


@Controller
public class ProBank7 {

    final int MAX = 6;
    final int MIN = 1;

    int range = MAX - MIN +1;

    private Lock lock;

    private static final Logger logger = LoggerFactory.getLogger(ProBank7.class);

    @RequestMapping("/homework1")
    public String homework1(Model model){
        logger.info("hoemwork1");
        int dice = (int)(Math.random()*range + MIN);

        model.addAttribute("dice1", dice);

        return "25th/homework1";
    }

    public int home(Model model){
        int num = 0;

        for(int i = 0; i < 5; i++){ // 일단 보자
            try {
                lock.lock();
                num++;
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
            return num;
        }
        return num;
    }

    @RequestMapping("/homework2")
    public String homework2(Model model) {
        logger.info("homework2");
        lock = new ReentrantLock();

        int[] num = new int[5];
        for(int i = 0; i< 5; i++) {
             num[i] = home(model);
            model.addAttribute("number", num);
        }
        return "25th/homework2";
    }
    /*
        @RequestMapping("/homework2")
    public String homework2(Model model) {
        logger.info("homework2");

        int num = 0;

        for(int i = 0; i < 5; i++) {
            num ++;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            model.addAttribute("number", num);
        }
        // return "25th/homework2"; --> 이 경우 +1을 했을때 끝이난다..
        // 계속 number값이 갱신되야한다.
        // lock -> 25th/homework2를 해야하는가.
        // lock -> number을 해야하는가?

        // critical Section 은 어떤 녀석일까..? -> 같이 접근을 해야하는 number을 critical Section이라고 정해보자.

        return "25th/homework2";
    }
     */

}
