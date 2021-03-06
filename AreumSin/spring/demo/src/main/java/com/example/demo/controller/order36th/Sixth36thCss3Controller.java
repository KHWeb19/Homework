package com.example.demo.controller.order36th;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/36th/css3")
public class Sixth36thCss3Controller {

    @GetMapping("/fontColorTest")
    public String fontColorTest(){
         log.info("fontColorTest()");

         return "/36th/css3/fontColorTest";
    }

    @GetMapping("/sectionTagTest")
    public String sectionTagTest(){
        log.info("sectionTagTest()");

        return "/36th/css3/sectionTagTest";
    }

    @GetMapping("/cssFileManageTest")
    public String cssFileManageTest(){
        log.info("cssFileManageTest()");

        return "/36th/css3/cssFileManageTest";
    }

    @GetMapping("/cssFontTest")
    public String cssFontTest(){
        log.info("cssFontTest()");

        return "/36th/css3/cssFontTest";
    }

    @GetMapping("/cssIdSelector")
    public String cssIdSelector(){
        log.info("cssIdSelector()");

        return "/36th/css3/cssIdSelector";
    }

    @GetMapping("/cssMouseHover")
    public String cssMouseHover(){
        log.info("cssMouseHover()");

        return "/36th/css3/cssMouseHover";
    }
}
