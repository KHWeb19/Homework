public class HW06 {
    public static void main(String[] args) {
        // 6. 주사위 2개 굴려서 눈금의 합 출력

        System.out.println("\n6. 주사위 2개 굴려서 눈금의 합 출력");

        int a = (int) (Math.random() * 6 +1);
        int b = (int) (Math.random() * 6 +1);

        System.out.printf("주사위 1: %d\n주사위 2: %d\n", a,b);

        System.out.printf("주사위 2개의 합은 : %d", a+b);

    }
}
