public class MyCustomDataTypeTest {

    public static void main(String[] args) {
        // int 변수 1개,float 변수 2개 double 변수 3개에 아무값이나 할당하고 출력
        //생성자+함수 덮어쓰기를 함꼐  활용하면 효율적으로 가능

        MyCustomDataType mcdt = new MyCustomDataType(1,2,3);//생성자 호출
        MyCustomDataType mcdt2 = new MyCustomDataType();//이건 아무것도 안넣었을 때 디폴트 값을 나옴
        //메서드의 이름이 같은데 서로 입력이 다르면 다른 것으로 인식함.
        MyCustomDataType mcdt3 = new MyCustomDataType(1,2f,3.0);//입력값만 적어넣어줌


        mcdt.allocRandom();//이제 이것을 만들어줌 랜덤값
        System.out.println(mcdt);



        MyCustomDataType mcdt4 = new MyCustomDataType(2,MyCustomDataType.INT_PROC);
        mcdt4.allocIntRandom();
        System.out.println(mcdt4);

        MyCustomDataType mcdt5 = new MyCustomDataType(3,MyCustomDataType.FLOAT_PROC);
        mcdt5.allocFloatRandom();
        System.out.println(mcdt5);

        MyCustomDataType mcdt6 = new MyCustomDataType(3,MyCustomDataType.DOUBLE_PROC);
        mcdt6.allocDoubleRandom();//이건 무슨뜻
        System.out.println(mcdt6);









    }


}
