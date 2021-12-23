public class Test2 {
    public static void main(String[] args) {

        //정수형 변수 1개, flot 변수 2개, double 변수 3개 아무값 넣고 출력.

        int num; num = 5;

        float fnum1 = 2.2f;
        float fnum2 = 3.3f;

        double fnum3 = 5.5;
        double fnum4 = 6.6;
        double fnum5 = 7.7;

        System.out.println("정수형 = " + num);

        System.out.println("변수Float 1 = " + fnum1);
        System.out.println("변수Float 2 = " + fnum2);

        System.out.printf("변수Double 3 = %.2f\n", fnum3);
        System.out.printf("변수Double 4 = %.2f\n", fnum4);
        System.out.printf("변수Double 5 = %.2f\n", fnum5);

    }
}
