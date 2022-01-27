public class Q9 {
    public static void main(String[] args) {

        int rand1 = (int) (Math.random() * 100 + 1);
        int num1 = 2;
        int num2 = 10;
        int num3 = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % rand1 == 0) {
                System.out.println(rand1 + "의 배수 : " + i);
                num3 += i;
            }
        }
        System.out.printf("합은? %d", num3);
    }
}
