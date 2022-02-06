package com.example.demo.entity.num1;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Data
public class Product {

    private int name;
    Productlist pl;


    //private int price;

    public Product(){

        pl= new Productlist();
        int randIdx = pl.randomFruit();

        name  = pl.kindsOfFruit[randIdx];

        //int randPrice=Productlist.randomPrice();
        //price = Productlist.priceArr[randPrice];

        }




}
