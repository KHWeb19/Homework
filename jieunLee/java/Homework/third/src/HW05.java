public class HW05 {
    public static void main(String[] args) {
        System.out.println("5. 1~100까지 숫자중 짝수만 출력해보자!\n");
        for (int i=1; i<=100; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
