public class Q3 {
    public static void main(String[] args) {


        //첫,셋 째수의 합이 넷째 수
        //첫째 수는 둘째 수로, 셋째는 넷째로 초기화
        int first = 1;
        int second = 1;
        int third = 1;
        int result = 0, i;


        //범위 값 설정
        final int MIN = 3;
        final int MAX = 25;

        for (i = MIN; i < MAX; i++) {
           //첫째, 둘째, 셋째, 넷째(결과) 수 초기화
            result = first + third;
            first = second;
            second = third;
            third = result;


            System.out.printf("%d\n 번째 %d\n",i+1,result);
        }
        System.out.printf("%d\n 번째 %d\n",i,result);

    }
}