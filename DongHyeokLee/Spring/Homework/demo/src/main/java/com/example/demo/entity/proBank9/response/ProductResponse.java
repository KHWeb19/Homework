package com.example.demo.entity.proBank9.response;

import com.example.demo.entity.proBank9.Product;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
public class ProductResponse {
    Map <String, Integer> goods;

    public ProductResponse(Product s){
        goods = new HashMap<>();
        String[] goodsName = s.getGoods();
        int[] price = s.getPrice();

        for(int i = 0 ; i < s.getRecommendGoodsNum(); i++){
                goods.put(goodsName[i] , price[i]);
        }

    }
}
