public class Question10 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;


        int decision = 0;
        int sum = 0;



        for (int i = START; i <= END; i += decision) {
            decision = (int) (Math.random() * range + MIN);

            System.out.printf("뽑은 난수 = %d, 현재 이동한 위치 = %d\n", decision, i);


            sum += i;
        }

        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}
