package com.example.homework.service.order10th;

import com.example.homework.entity.order10th.Market;
import com.example.homework.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService { //서비스 시행용 클래스

    @Autowired
    MarketRepository repository; //저장소의 데이터베이스를 시행시키기 위해 AutoWired

    @Override
    public List<Market> list() {return repository.list();}


}
