package com.example.bank.controller.bank9;

import com.example.bank.entity.bank9.Lotto;
import com.example.bank.entity.bank9.ViewLottoPlacement;
import com.example.bank.entity.bank9.ViewMyLotto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/bank9")
public class Hw2Controller {

    @GetMapping("/homework2")
    public String homework2 () {
        log.info("homework2 check");

        return "bank9/homework2";
    }

    @ResponseBody
    @PostMapping("/view-lottoPlacement")
    public ViewLottoPlacement viewLottoPlacement () {
        log.info("viewLottoPlacement check");

        Lotto lotto = new Lotto(100, 5);
        lotto.allocTotalArr();
        lotto.allocLottoArr();
        ViewLottoPlacement viewLottoPlacement = new ViewLottoPlacement(lotto.getTotalArr(), lotto.getLottoArr());
        return viewLottoPlacement;
    }

    @ResponseBody
    @PostMapping("/view-myLotto")
    public ViewMyLotto viewMyLotto () {
        log.info("viewMyLotto check");

        Lotto lotto = new Lotto(100, 5);
        lotto.allocTotalArr();
        lotto.allocLottoArr();
        lotto.rollLotto();
        ViewMyLotto viewMyLotto = new ViewMyLotto(lotto.getMyNum(), lotto.getYesOrNo());
        return viewMyLotto;
    }
}