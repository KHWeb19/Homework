public class HW04 {
    public static void main(String[] args) {
        // 4. float 변수 2개에 랜덤값 할당하고 출력
        System.out.println("\n4. float 변수 2개에 랜덤값 할당하고 출력");

        float a = (float) (Math.random() * 10);
        float b = a * 10;

        System.out.printf("랜덤값 0.000 ~ 9.999ㅡ 첫번째 변수: %f\n", a);
        System.out.printf("랜덤값 0.000 ~ 99.999ㅡ 첫번째 변수: %f\n", b);
    }
}
