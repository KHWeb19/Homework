package com.example.homework.service.order10th;

import com.example.homework.entity.order10th.Market;
import com.example.homework.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.error.Mark;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService { //서비스 시행용 클래스

    @Autowired
    MarketRepository repository; //저장소의 데이터베이스를 시행시키기 위해 AutoWired

    @Override
    public void register(Market market){
        repository.create(market);
    }

    @Override
    public List<Market> list() {return repository.list();}

    @Override
    public Market read(Integer productNo){
        return repository.read(productNo);
    }

    @Override
    public void modify(Market market) {
        repository.update(market);
    }

    @Override
    public void remove(Integer productNo) {
        repository.remove(productNo);
    }


}
