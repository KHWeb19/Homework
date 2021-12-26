public class Quiz9 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {

            int rand = (int)(Math.random()*9+2);
            System.out.println("랜덤으로 선택한 수는 " +rand);

            for (int j = 1; j <= 100; j++) {
                if (j % rand == 0) {
                    System.out.println("1~100 사이의 선택한수 의 배수 " + j);
                    sum += j;
                }
            }
            System.out.println(i+"회차 총합 " +sum);
            System.out.println();
        }
        System.out.println("출력된 수들의 총합 " +sum);
    }
}
