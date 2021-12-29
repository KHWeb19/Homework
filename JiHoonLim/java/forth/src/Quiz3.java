public class Quiz3 {
    public static void main(String[] args) {

        /*
        1. 피보나치와 비슷한 원리로 항의 값을 변경하면서 for문진행
        2. 1항 + 3항 = 4항 라는 구조
        3. 각 항의 값을 계속 수정해주면서 반복
         */
        int first = 1;
        int second = 1;
        int third = 1;
        int sum = 0, i;

        final int START = 3;
        final int END = 25;

        for (i = START; i < END; i++){
            sum = first + third;
            first = second;
            second = third;
            third = sum;
        }
        System.out.println(i+ "번째 항은 " +sum);
    }
}
