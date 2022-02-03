package com.example.demo.controller.Homework;

import com.example.demo.Homework.HW2.Lotto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/homework9/num2")
public class HW2Controller {

   /* @ResponseBody
    @GetMapping("/lotto")
    public String Lotto(Model model) {

        Lotto lotto= new Lotto();
        lotto.raffle();
        model.addAttribute("winner",lotto.getSelectArr());
       // log.info("lotto: " + lotto);

        return "29th/homework/lotto";
    }*/

    //로또의 클래스를 만들어놓았는데 여기서 어떻게 연결시키는 것이 어렵다
    //제이슨 형식으로 보내려 하는데 어떻게 보내야 하지


    @ResponseBody
    @GetMapping("/lotto")
    public Lotto test()  {

        log.info("test()");

        Lotto lotto= new Lotto();

       // lotto.peopleNumber();
       // lotto.selNumber();

        log.info("lotto: " + lotto);

        return lotto;
    }



}
