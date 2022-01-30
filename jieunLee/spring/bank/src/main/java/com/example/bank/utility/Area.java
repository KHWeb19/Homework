package com.example.bank.utility;

import lombok.Data;

@Data
public class Area {
    private int base;
    private double area;

    public Area (int base) {
        this.base = base;
    }

    public void equTriangleArea () {
        area = Math.sqrt(3)/4*Math.pow(base, 2);
    }

    public void squareArea () {
        area = Math.pow(base, 2);
    }

    public void regHexagonArea () {
        area = 3*Math.sqrt(3)*Math.pow(base, 2)/2;
    }
}
