public class HW03 {

    public static void main(String[] args) {
        // 3. 정수형 변수 2개에 랜덤값을 할당하고 출력
        System.out.println("\n3. 정수형 변수 2개에 랜덤값을 할당하고 출력");
        int a = (int) (Math.random() * 10);
        int b = a + 20;

        System.out.printf("랜덤값 0~9, 첫번째 변수: %d\n",a);
        System.out.printf("랜덤값 20~29, 두번째 변수: %d\n", b);

    }


}
