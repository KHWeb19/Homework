package com.example.demo.controller;

public class BANK3 {


    int first;
    int second;
    int third;
    int result;
    int i;

    int START;
    int END;

    BANK3(int first, int second, int third, int result, int i, int START, int END) {

        this.first = first;
        this.second = second;
        this.third = third;
        this.result = result;
        this.i = i;
        this.START = START;
        this.END = END;

    }

    int getResult() {
        for (i = START; i < END; i++) {
            result = first + third;
            first = second;
            second = third;
            third = result;
        }
        return result;
    }
}