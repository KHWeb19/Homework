public class Quiz10 {
    public static void main(String[] args) {

        int sum = 0;
        int sum2 =0 ;

        for (int i = 1; i <= 100; i++) {

            int rand = (int)(Math.random()*9+2);
            System.out.println("랜덤으로 선택한 수는 " +rand);

            sum += rand;
            sum2 += sum;
            System.out.println(i+"회차 이동거리 " +sum);
            System.out.println();

            /// 문제를 제대로 이해한 건지 모르겠습니다.
        }
        System.out.println("이동 시 나온 숫자들의 합 " +sum2);
    }
}