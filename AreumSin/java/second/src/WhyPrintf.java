public class WhyPrintf {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7, num3 = 33, num4 = 77;

        System.out.println("num1 = " + num1 + "num2 = " + num2 + "num3 = " + num3 );

        System.out.printf("num1 = %d, num2 = %d, num3 = %d, num4 = %d ", num1, num2, num3, num4);

        // printf를 사용하면 문자열과 변수를 한번에 쓸 수 있다.
        // 사용에 따라 선택
    }
}
