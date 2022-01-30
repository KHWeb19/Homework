package com.example.bank.utility;

import lombok.Data;

@Data
public class ViewSqaureArea {
    private int base;
    private double area;

    public ViewSqaureArea(int base, double area) {
        this.base = base;
        this.area = area;
    }
}
