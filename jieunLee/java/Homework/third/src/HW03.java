public class HW03 {
    public static void main(String[] args) {
        System.out.println("3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...\n" +
                "이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!\n");

        int x = 1;
        System.out.println("1번째 항: " + x);
        int y = 1;
        System.out.println("2번째 항: " + y);
        int z = 1;
        System.out.println("3번째 항: " + z);

        for (int i=4; i<=25; i++) {
            int sum = z + x;
            System.out.printf("%d번째 항: %d\n", i, sum);
            x = y;
            y = z;
            z = sum;
        }
    }
}
