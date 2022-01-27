public class HW02 {
    public static void main(String[] args) {
        System.out.println("2. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!\n");

        int front = 1;
        System.out.println("1번째 항: " + front);
        int back = 1;
        System.out.println("2번째 항: " + back);

        for (int i=3; i<=20; i++) {
            int sum = front + back;
            System.out.printf("%d번째 항: %d\n", i, sum);
            front = back;
            back = sum;
        }
    }
}
