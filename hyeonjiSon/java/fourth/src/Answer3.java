public class Answer3 {
    public static void main(String[] args) {
        //문제3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!
              // 12/23일 숙제 당시 1~3항의 수를 더하면 5항의 값이 나오는 방식으로 풀이함. (정수 변수 5개 필요)
              // 원래 의도된 1, 3항을 더하면 4항의 값이 나오는 방식으로 만들어보자! (정수 변수 4개 필요)

        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        int sum = 0, i;

        final int start = 3;
        final int end = 25;

        System.out.printf("%d, %d, %d, ", num1, num2, num3);
        for (i = start; i < end; i++){
            //i값을 3으로 바꿔줌; i의 값이 25가 될 때 까지; 매 회 +1씩 숫자가 커지며 반복한다는 조건을 만족하는 경우

            sum = num1 + num3;

            System.out.printf("%d, ", sum);

            num1 = num2;
            num2 = num3;
            num3 = sum;

        }

        System.out.printf("\n수열 %d번째 항의 값은 = %d", i, sum);

    }
}
