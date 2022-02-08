package com.example.demo.utility.product;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Product extends Price {

    public ArrayList<String> game = new ArrayList<>();

    private final int MAX =  game.size();
    private final int MIN = 1;
    private int range = MAX - MIN + 1;
    private final int RECOMMEND = 3;

    private int [] randPrice;

    public Product(){

        super();
        game.add("It take two");
        game.add("Stardew Vally");
        game.add("SIMS4");
        game.add("Don't Starve");
        game.add("Overcooked2");

    }

    public void recommend (){
        int tmp [] = new int[RECOMMEND];

        for (int i = 0; i < RECOMMEND; i++ ){
            tmp [i] = (int)(Math.random() * range + MIN);
            if (tmp [i] = game<i>)
        }


    }

}
