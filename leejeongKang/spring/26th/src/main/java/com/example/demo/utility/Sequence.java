package com.example.demo.utility;
import java.util.Scanner;
import lombok.Data;

@Data
public class Sequence {
    private int seq = 1;
    private final int RATIO = 2;
    Scanner scanner = new Scanner(System.in);
    public int scan;

    public void inputUser() {
        while (true) {
            System.out.println("Input Num");
            scan = scanner.nextInt();
            if (scan > 32) {
                System.out.println("Under 32");
            }
            else {
                break;
            }
        }
    }
    public void calcSeq(){
        for(int i=1; i<scan; i++){
            seq *= RATIO;
        }
    }
    public int getSeq(){
        return seq;
    }
}