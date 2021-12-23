public class HW10 {
    public static void main(String[] args) {
        // 10. 65~90까지의 난수와 97~122까지의 난수 무작위 생성

        System.out.println("10. 65~90까지의 난수와 97~122까지의 난수 무작위 생성");

        int a_min = 65;
        int a_max = 90;

        int a = (int) (Math.random() * (a_max - a_min +1) + a_min);

        int b_min = 97;
        int b_max = 122;

        int b = (int) (Math.random() * (b_max - b_min +1) + b_min);

        System.out.printf("랜덤숫자(65~90) : %d\n", a);
        System.out.printf("랜덤숫자(97~122) : %d\n", b);
    }
}
