package com.example.demo.utility.proBank8;



import java.util.Scanner;


//아래와 같은 등비 수열이 있다.
//    1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
//    사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
//    (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

// 사용자 입력이면 이 입력이 홈페이지에 떠서 거기서 입력이 가능한건가?!

public class GeometricSequence {

    private final int MAX = 32;
    private Scanner sc;
    private int base , num;


    private int[] sequenceArr;

    public GeometricSequence(final int base){
        this.base = base;
        sequenceArr = new int[MAX];

    }

    //32를 넘는 숫자 입력할 경우 다시 입력하는것을 넣어야함
    //이렇게 해도 홈페이지에서 입력하라고 뜨나??
    //출력부분은 url요쳥 했을때 인텔리제이상에서 출력됨
    //그러면 웹페이지상에서 문구가 출력되고 사용자가 입력하게는 어떻게할까..?
    //html쪽에서 해결해야되나?
    //그럼 html에 값을 사용자가 입력하면 자바로 어떻게 떙겨옴?
    public void selectSequenceNum(){
        sc = new Scanner(System.in);

        System.out.println("원하는 항의 위치를 입력하시오");
        num = sc.nextInt();
        geometricSequenceGenerate();

    }


    public void geometricSequenceGenerate(){

        if(num> MAX){
            System.out.println("32보다 클수 없습니다. 다시입력하세요.");
            selectSequenceNum();
        }else {

            for (int i = 0; i < MAX; i++) {
                sequenceArr[i] = (int) (Math.pow(base, i));
            }

        }
    }

    public int getSequenceValue(){
        return sequenceArr[num];
    }


}
