package com.example.homework.service.order10th;

import com.example.homework.entity.order10th.Market;

import java.util.List;

public interface MarketService {
    public void register (Market market);
    public List<Market> list();
    public Market read(Integer productNo);
    public void modify (Market market);
    public void remove (Integer productNo);

}

//상품 등록
//상품 삭제
//상품 리스트
//상품 수정
//상품 상세보기(본문 읽기)