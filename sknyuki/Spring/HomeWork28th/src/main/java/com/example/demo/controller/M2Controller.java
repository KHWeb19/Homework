package com.example.demo.controller;

import com.example.demo.utillity.Lotto.Lotto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@ResponseBody
@Controller
public class M2Controller {
    private final static Logger logger = LoggerFactory.getLogger(M1Controller.class);

    @GetMapping("/view-homework2")
    public HashMap homework2(Model model) {
        logger.info("enter/(homework2)");

//   JSON Viewer 상에서 로또에 당첨된 사람들은 부여받은 번호와 O가 표기되도록 만들어보자!
//
//   당첨되지 않은 사람들은 부여받은 번호와 X가 표기되도록 만든다.

        //로또 당첨번호와 참가자들번호를 메소드로 출력
        //
        //hash map사용 당첨 key->당첨번호, value->"O"or"X"를 대입해서 JSON으로 호출하면 완료->담청번호만 "O"로 표시 else는 "X"

        Lotto l= new Lotto(100, 5);

        l.raffle();



        return l.getLottoWinner();
    }
}
