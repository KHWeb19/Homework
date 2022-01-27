package com.example.demo.controller;



import com.example.demo.thread.ThreadWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


 @Controller
    public class Bank72 {

     private final static Logger logger = LoggerFactory.getLogger(Bank72.class);

     @RequestMapping("/homework2")
     public String homework2(Model model) throws InterruptedException {
         logger.info("client entered /homework2");

         model.addAttribute("add", ThreadWorker.getSyncLockTest());

         return "25th/homework2";
         //여기에 스레드를 만들어주면 다시 동작하면 다시 객체를 만들주어서 독립적은 스레드로 만들어줌
         //메인에 스레드를 넣어줌


     }
 }



