package com.example.demo.controller.order33;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/33th/html")
public class HtmlController {

    @GetMapping("/list")
    public String htmlList(){

        log.info("list");

        return "/33th/html/list";
    }

    @GetMapping("/imgTag")
    public String htmlImg(){
        log.info("imgTag");

        return "/33th/html/imgTag";
    }

    @GetMapping("/hpbrTag")
    public String htmlHPBR(){
        log.info("hpbr");

        return "/33th/html/hpbrTag";
    }

    @GetMapping("/fontExample")
    public String htmlFont(){
        log.info("font");

        return "/33th/html/fontExample";
    }

    @GetMapping("/markAndColorExample")
    public String htmlMarkAndColor(){
        log.info("markAndColor");

        return "/33th/html/markAndColorExample";
    }

    @GetMapping("/tableExample")
    public String htmlTable(){
        log.info("table");

        return"/33th/html/tableExample";
    }

    @GetMapping("/checkBox")
    public String htmlCheckBox(){
        log.info("checkBox");

        return"/33th/html/checkBox";
    }

    @GetMapping("/radioBox")
    public String htmlRadioBox(){
        log.info("radioBox");

        return"/33th/html/radioBox";
    }

    @GetMapping("/loginForm")
    public String htmlLoginForm(){
        log.info("loginForm");

        return "/33th/html/loginForm";
    }


}
