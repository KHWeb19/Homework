package com.example.demo.entity.PB0903;

public class AreaCalculator {
    TriangleCalculator tc;
    RectangleCalculator rc;

    private int choice;

    public AreaCalculator(int choice, int length, int height){
        this.choice = choice;

        switch (choice){
            case 1:
                tc = new TriangleCalculator(length,height);

            case 2:
                rc = new RectangleCalculator(length,height);

            default:
                break;
        }
    }

    public float getArea() {
        switch (choice) {
            case 1:
                return tc.getArea();
            case 2:
                return rc.getArea();
            default:
                return 0;
        }
    }



}
