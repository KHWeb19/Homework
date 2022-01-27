package com.example.demo.utility;

import java.util.Scanner;

public class geoSeq {
    final int MAX = 31;
    final int START_IDX = 0;
    final int BASE = 2;

    public Object Input() {

        System.out.print("찾고자하는 수열의 항을 입력해주세요: ");
        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt();

        int[] seq = new int[idx];

        if (idx > MAX) {
            System.out.println("31이 최대여!!!");
        } else {
            for (int i = START_IDX; i <idx; i++) {
                seq[i] = (int) Math.pow(BASE, i);
                System.out.printf("seq[%d] = %d\n", i, seq[i]);
            }
        }
        return null;
    }
}

