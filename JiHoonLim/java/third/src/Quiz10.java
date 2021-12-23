public class Quiz10 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {

            int rand = (int)(Math.random()*9+2);
            System.out.println("랜덤으로 선택한 수는 " +rand);

            sum += rand;
            System.out.println(i+"회차 이동거리는 " +sum);
            System.out.println();
        }
    }
}