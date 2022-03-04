package com.example.demo.controller.order38;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/play/ncvue")
public class PlayVueController {

    @GetMapping("/vue-index")
    public String index () {
        log.info("index()");

        return "/38th/ncvue/index";
    }

    @GetMapping("/dataType")
    public String dataType(){
        log.info("dataType()");

        return "/38th/ncvue/dataType";
    }

    @GetMapping("/jsDataType")
    public String jsDataType(){
        log.info("jsDataType()");

        return "/38th/ncvue/jsDataType";
    }

    @GetMapping("/doNotUseVar")
    public String doNotUseVar(){
        log.info("doNotUseVar()");

        return "/38th/ncvue/doNotUseVar";
    }

    @GetMapping("/jsArrowStyle")
    public String jsArrowStyle(){
        log.info("jsArrowStyle()");

        return "/38th/ncvue/jsArrowStyle";
    }



}

