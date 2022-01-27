package com.example.demo.controller;


import com.example.demo.utility.ClassAverage;
import com.example.demo.utility.GeometricSequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.management.GarbageCollectorMXBean;

@Controller
public class ProBank8Controller {

    private final static Logger logger= LoggerFactory.getLogger(ProBank8Controller.class);

            //기존에 homework1이 있어 중복이 안됌
            @RequestMapping("/homework3")
            public String bank8Homework1(Model model){
                logger.info("homework3");

                GeometricSequence seq = new GeometricSequence(2);

                //구하고 싶은 등비수열 위치 입력하는 부분에서 작동이안됨
                //어떻게 해야할까
                seq.selectSequenceNum();
                seq.geometricSequenceGenerate();

                model.addAttribute("sequenceValue" , seq.getSequenceValue());

                return "26th/homework3";
            }

            @RequestMapping("/homework4")
            public String bank8Homework2(Model model){
                logger.info("homework4");

                ClassAverage avg = new ClassAverage(30);
                avg.average();

                model.addAttribute("classAvg", avg.getAvg());

                return "26th/homework4";



            }
}
