package com.example.demo.controller.order41;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
@RequestMapping("/41th/collection")
public class CollectionController {

    @GetMapping("/mapTest")
    public String getMapTest () {
            log.info("getMapTest");

            return "/41th/collection/mapTest";
    }


    @GetMapping("/setTest")
    public String getSetTest () {
        log.info("getSetTest");

        return "/41th/collection/setTest";
    }

}
