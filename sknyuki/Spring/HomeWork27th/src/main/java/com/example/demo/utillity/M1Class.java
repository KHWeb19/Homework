package com.example.demo.utillity;

//Sanner을 쓰고 싶기는 한데 spring에서의 연동 법을 모르겠으니
//controller에서 value값으로 원하는 수를 입력하는 형식으로
public class M1Class {
    //Scanner scan=new Scanner(System.in);
    //private int PowNum;
    private int BaseNumber;
    private int value;

    /*
        public void PrintNum(){
            //System.out.println("2의 몇승을 구하시겠습니까?");
            powNum=scan.nextint();

        }
    */
    public M1Class(int BaseNumber) {
        this.BaseNumber=BaseNumber;
    }


    public int getValue(int cnt) {
        for (int i = 0; i < cnt; i++) {
            value = (int) (Math.pow(2, i));
            System.out.println(value);
        }
        return value;

    }
}