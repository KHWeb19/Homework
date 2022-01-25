package com.example.demo.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


 @Controller
    public class Bank72 {

     private static final Logger logger = LoggerFactory.getLogger(com.example.demo.controller.Bank72.class);

     @RequestMapping("/homework2")
     public String homework2(Model model) throws InterruptedException {
         logger.info("client entered /homework2");

         int test = 0;
         try {
           for (int i = 0; i < 1000000; i++) {
               test += i;

                 Thread.sleep(3000);
           }
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }



         model.addAttribute("add", test);

         return "25th/homework2";


     }
 }



