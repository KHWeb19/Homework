public class Problem06 {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 100) {
            if (i % 3 == 0) {
                System.out.printf("3의 배수 %d 입니다.\n", i);
            }
        }
    }
}
