package com.example.demo.controller.order38;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/38th/vue")
public class VueController {


    @GetMapping("/vueIndex")
    public String vueIndex(){
        log.info("vueIndex");

        return "/38th/vue/vueIndex";
    }
    @GetMapping("/dataTypeCheck")
    public String dataTypeCheck(){
        log.info("dataTypeCheck");

        return "/38th/vue/dataTypeCheck";
    }
    @GetMapping("/jsDataType")
    public String jsDataType(){
        log.info("jsDataType");

        return "/38th/vue/jsDataType";
    }

    @GetMapping("/doNotUseVar")
    public String doNotUseVar(){
        log.info("doNotUseVar");

        return "/38th/vue/doNotUseVar";
    }
    @GetMapping("/jsArrowStyle")
    public String jsArrowStyle(){
        log.info("jsArrowStyle");

        return "/38th/vue/jsArrowStyle";
    }
}
