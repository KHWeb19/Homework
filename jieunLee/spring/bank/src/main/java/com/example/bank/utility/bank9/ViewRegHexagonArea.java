package com.example.bank.utility.bank9;

import lombok.Data;

@Data
public class ViewRegHexagonArea {
    private int base;
    private double area;

    public ViewRegHexagonArea(int base, double area) {
        this.base = base;
        this.area = area;
    }
}
