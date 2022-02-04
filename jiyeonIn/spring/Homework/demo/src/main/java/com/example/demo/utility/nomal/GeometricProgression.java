package com.example.demo.utility.nomal;


import lombok.Data;

@Data
public class GeometricProgression {

    private int tmp=0;
    private int ratio;
    private int total;

    public GeometricProgression(int ratio, int total) {
        this.ratio = ratio;
        this.total = total;
    }


    public void findGeometric() {
        tmp = (int) (Math.pow(2, total-1));
    }
}

