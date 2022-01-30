package com.example.demo.utility.product;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Product extends Price {

    private ArrayList<String> game = new ArrayList<>();

    public Product(){

        game.add("It take two");
        game.add("Stardew Vally");
        game.add("SIMS4");
        game.add("Don't Starve");
        game.add("Overcooked2");

    }




}
