package com.example.demo.utility;

public class Sequence {
    // 1. 아래와 같은 등비 수열이 있다.
    // 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
    // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!

    private static int seqNum;
    private final int MAX = 31;

    private static int seqArr[];

    public Sequence(int seqNum){
        this.seqNum = seqNum;
        seqArr = new int[MAX];

        calcSequence();
    }

//    public static void calcSequence(){
    // 컨트롤러 클래스에서 에러남
//        int tmp = 0;
//
//        for (int i = 0; i < seqArr.length ; i++){
//            seqArr[i] = (int)Math.pow(seqNum,i);
//            tmp = seqArr[i];
//
//            System.out.printf("2^%d = %d", i, tmp);
//        }
//    }

    public static int calcSequence(){
        int tmp = 0;

        for (int i = 0; i < seqArr.length ; i++){
            seqArr[i] = (int)Math.pow(seqNum,i);
            tmp = seqArr[i];
        }

        return tmp;
    }
}
