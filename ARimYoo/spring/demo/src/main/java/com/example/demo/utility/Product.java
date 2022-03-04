package com.example.demo.utility;

import lombok.Data;

@Data
public class Product {

    public static String [] game (){
        String [] game = {"It takes two", "Stardew vally", "SIMS4", "Don't Starve", "Overcooked2"};

        return game;
    }

    public static int [] price () {
        int [] price = {35000, 18000, 40000, 5000, 8000};

        return price;
    }

}
