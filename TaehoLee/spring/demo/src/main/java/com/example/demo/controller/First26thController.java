package com.example.demo.controller;

//import com.example.demo.utility26th.AddNum;
import com.example.demo.utility26th.Dice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/26th")
public class First26thController {

    private static final Logger logger = LoggerFactory.getLogger(First26thController.class);

    @RequestMapping("/homework1")
    public String homework1(Model model) {
        logger.info("client entered / homework1");

        Dice dice = new Dice(1,6);
        dice.rollDice();
        int diceNum = dice.getDiceNum();
        model.addAttribute("number", diceNum);

        return "26th/homework1";
    }

    /*

    @RequestMapping("/homework2")
    public String homework2(Model model) {
        logger.info("client entered /homework2");
        AddNum addnum = new AddNum(0, 1, 3000);
        Thread t1 = new Thread(addnum);
        t1.interrupt();
        t1.start();
        int test = addnum.gettmpTest();

        model.addAttribute("number", test);

        return "26th/homework2";
    }
    */
}
