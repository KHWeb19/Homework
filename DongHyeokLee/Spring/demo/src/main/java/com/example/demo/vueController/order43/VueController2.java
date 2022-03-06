package com.example.demo.vueController.order43;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/43th/vue")
public class VueController2 {

    @GetMapping("/dataBind")
    public String dataBind () {
        log.info("dataBind");

        return "/43th/vue/dataBind";
    }

    @GetMapping("/sepFileDataBind")
    public String sepFileDataBind () {
        log.info("sepFileDataBind");

        return "/43th/vue/sepFileDataBind";
    }

    @GetMapping("/varDataBind")
    public String varDataBind () {
        log.info("varDataBind");

        return "/43th/vue/varDataBind";
    }

    @GetMapping("/clickEvent")
    public String clickEvent () {
        log.info("clickEvent");

        return "/43th/vue/clickEvent";
    }

    @GetMapping("/rolePlayGame")
    public String rolePlayGame () {
        log.info("rolePlayGame");

        return "/43th/vue/rolePlayGame";
    }




}
