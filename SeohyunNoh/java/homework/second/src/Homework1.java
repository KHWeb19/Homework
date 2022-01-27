public class Homework1 {
    public static void main(String[] args) {
        int num1 = 10;
        // 수업에서는 float fnum2 이런식으로 앞에 f를 쓰셨는데
        // 앞에 f를 쓰니까 오류가 남
        // 앞에는 안 붙여도 무방한가?
        float num2 = 5.5f , num3 = 7.789f;
        double num4 = 3.1 , num5 = 2 , num6 = 10.3 ;

        System.out.println("num1 : " + num1);

        System.out.println("num2 : " + num2);
        // 소수점 아래 둘째자리 까지 출력하기 해봄
        System.out.printf("num3 : %.2f\n " , num3);

        System.out.printf("num4 : %f\n" , num4);
        System.out.printf("num5 : %f\n" , num5);
        System.out.println("num6 : " + num6);

    }
}
