package com.example.demo.utility.area;

public class areaKind {
    private int x;
    private double area;

    public areaKind(int x){
        this.x=x;
    }

    public double Triangle(){
        return area = (Math.sqrt(3) * Math.pow(x,2)) / 4;
    }
    public double Square(){
        return area = x * x;
    }
    public double Hexagon() { return area = Triangle() * 6;}
}