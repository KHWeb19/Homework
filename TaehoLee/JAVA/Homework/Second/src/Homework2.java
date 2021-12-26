public class Homework2 {
    // 정수형 변수 2개에 랜덤값을 할당하고 출력합니다.

    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 100), num2 = (int)(Math.random() *100);

        System.out.printf("정수형 변수 랜덤값 2개 : %d, %d", num1, num2);
    }
}
