package com.example.bank.utility.bank9;

import lombok.Data;

@Data
public class ViewEquTriangleArea {
    private int base;
    private double area;

    public ViewEquTriangleArea(int base, double area) {
        this.base = base;
        this.area = area;
    }
}
