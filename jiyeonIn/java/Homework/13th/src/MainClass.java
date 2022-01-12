public class MainClass {

    public static void main(String[] args) {
        //정수형변수 1 / float변수 2개 / double 변수 3개 출력
        SubClass sb = new SubClass(1,2,3);


        SubClass sb1 = new SubClass(2,SubClass.INT_PROC);
        sb1.alloIntRand();
        System.out.println(sb1);
        SubClass sb2 = new SubClass(2,SubClass.FLOAT_PROC);
        sb2.alloFloatRand();
        System.out.println(sb2);
        SubClass sb3 = new SubClass(2,SubClass.DOUBLE_PROC);
        sb3.alloDoubleRand();
        System.out.println(sb3);
    }
}
