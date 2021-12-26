public class HW05 {
    public static void main(String[] args) {
        // 5. double 변수 2개에 랜덤값 할당 출력

        System.out.println("\n5. double 변수 2개에 랜덤값 할당 출력");
        double a = Math.random();
        double b = a * 10;

        System.out.printf("랜덤값 0.000 ~ 9.999ㅡ 첫번째 변수: %f\n", a);
        System.out.printf("랜덤값 0.000 ~ 99.999ㅡ 첫번째 변수: %f\n", b);

    }

}
