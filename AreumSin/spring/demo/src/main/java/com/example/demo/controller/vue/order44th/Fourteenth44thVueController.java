package com.example.demo.controller.vue.order44th;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/44th/vue")
public class Fourteenth44thVueController {

    @GetMapping("/dataBind")
    public String getDataBind(){
        log.info("getDataBind");

        return "/44th/vue/dataBind";
    }

    @GetMapping("/sepFileDataBind")
    public String getSepFileDataBind(){
        log.info("getSepFileDataBind");

        return "/44th/vue/sepFileDataBind";
    }

    @GetMapping("/varDataBind")
    public String getVarDataBind(){
        log.info("getVarDataBind");

        return "/44th/vue/varDataBind";
    }

    @GetMapping("/clickEvent")
    public String getClickEvent(){
        log.info("getClickEvent");

        return "/44th/vue/clickEvent";
    }

    @GetMapping("/rolePlayGame")
    public String getRolePlayGame(){
        log.info("getRolePlayGame");

        return "/44th/vue/rolePlayGame";
    }
}
