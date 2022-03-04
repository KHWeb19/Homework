package com.example.demo.controller.order36;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/36th/css3")
public class Css3Controller {

    @GetMapping("/fontColor")
    public String fontColerTest(){
        log.info("fontColor");

        return "/36th/css3/fontColor";
    }

    @GetMapping("/sectionTag")
    public String sectionTag() {
        log.info("sectionTag");

        return "/36th/css3/sectionTag";
    }

    @GetMapping("/cssFileManage")
    public String cssFileManage(){
        log.info("cssFileManage");

        return "/36th/css3/cssFileManage";
    }

    @GetMapping("/cssFont")
    public String cssFont() {
        log.info("cssFont");

        return "/36th/css3/cssFont";
    }

    @GetMapping("/cssIdSelector")
    public String cssIdSelector() {
        log.info("cssIdSelector");

        return "/36th/css3/cssIdSelector";
    }


    @GetMapping("/cssMouseHover")
    public String cssMouseHover() {
        log.info("cssMouseHover");

        return "/36th/css3/cssMouseHover";
    }

}
