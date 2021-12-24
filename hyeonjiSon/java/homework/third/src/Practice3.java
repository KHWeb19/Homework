public class Practice3 {
    public static void main(String[] args) {
        //문제3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //      이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!
        //나라야나 소의 수열 : N(k) = N(k-1) + N(k-3)

        int num1 = 0;
        int num2 = 1;
        int num3 = 1; //num1~3의 숫자가 더해지면 그 다음 항의 숫자가 나옴의 반복!
        int num4 = 1;

        int sum = 0;

        System.out.printf("%d(0항), %d, %d, %d, ", num1, num2, num3, num4); //맨 앞의 3항 0, 1, 1, 1을 출력
        int again = 1;

        while(again <= 22 ){ // 맨 앞의 3항(1, 1, 1) 포함 25번째 항이 나올 때 까지 반복
            again++;

            sum = num1 + num2 + num3; //sum은  num1 + num2 + num3의 값이라는 결과가 반복되어야 함.

            System.out.printf("%d, ", sum); //4항까지 1, 1, 1, 2가 잘 나옴!

            // 매회 num1 >2, num2 >3, num3 >4, num4 > sum, sum > 다음 합으로 변수를 변경해주어야 함!
            num1 = num2;
            num2 = num3;
            num3 = num4;
            num4 = sum;
        }
        System.out.println("나라야나 소 수열 25번째 항의 값은 = " + sum);
    }
}
