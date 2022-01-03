public class third8 {
    public static void main(String[] args) {
        int max = 10, min = 2;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range + min);

        for (int i = 1; i < 101; i++) {
            if (i == rand) {
                System.out.printf("범위 안의 랜덤 숫자를 출력한다. : %d\n", i );
                for (int j = 1; i * j < 101; j++) {
                    System.out.printf("랜덤 숫자의 배수를 출력한다 : %d\n", i * j);
                }
            }
        }
    }
}
