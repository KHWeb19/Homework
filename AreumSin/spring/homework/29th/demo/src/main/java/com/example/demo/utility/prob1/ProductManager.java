package com.example.demo.utility.prob1;

import lombok.Data;

@Data
public class ProductManager {
    private int todayNum;
    private ProductPrice[] todayPrice;
    private int max;
    private ProductPrice price;
    private TodayProduct tp;

    // 몇개의 상품을 배치할것인지에 대한 값이 필요함.

    public ProductManager(int max){
        this.max = max;
        todayPrice = new ProductPrice[max];

        for(int i = 0; i < max; i++){
            todayPrice[i] = new ProductPrice();
        }

        tp = new TodayProduct(max);
        // TodayProduct(int productNum){ //MAX

    }

    public void Repetition(){
        for(int i = 0; i < max; i++){
            todayPrice[i].calcPrice();
        }
    }

    public void pickNum(){
        todayNum = tp.calcTodayNum();;
    }

    public ProductPrice todayPrice(int num){
        price = todayPrice[num];
        return price;
    }
}
