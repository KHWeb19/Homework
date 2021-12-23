public class HW06 {
    public static void main(String[] args) {
        System.out.println("6. 1~100까지 숫자중 3의 배수만 출력해보자!\n");
        for (int i=1; i<=100; i++) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
    }
}
