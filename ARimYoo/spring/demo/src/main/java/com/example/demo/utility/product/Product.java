package com.example.demo.utility.product;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Product extends Price {

    private ArrayList<String> game = new ArrayList<>();
    private int [] randPrice;

    public Product(){

        super();
        game.add("It take two");
        game.add("Stardew Vally");
        game.add("SIMS4");
        game.add("Don't Starve");
        game.add("Overcooked2");

    }

    public void getPrice (){

        randPrice = new int [game.size()];
        Price price = new Price ();

        for (int i = 0; i < game.size(); i++){

            randPrice[i] = price.RandPrice();

        }
    }

}
