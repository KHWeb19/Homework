public class Practice2 {
    public static void main(String[] args) {
        //문제2. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!
        //피보나치 수열이란?
                 // 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열이다.

        int i = 1;
        int j = 1;
        int sum = 0;

        int again = 1;

        System.out.printf("%d, %d, ", i, j); //맨 앞의 1, 1 한 번만 나옴
        while( again <= 18){ //맨 앞 두 항(1, 1)를 포함한 20번째 항이 나올 때 까지
            again++; // 반복마다 +1해가며 18회를 돈다.

                         // int i + int j = sum이 반복되도록 만드려고 함!
            sum = i + j; // sum은 i + j 값이다.

            System.out.printf("%d, \n", sum); //sum의 값을 출력

            // 매회 i > j, j > sum, sum > 다음 합 으로 변수를 변경해주어야 함!
            i = j;
            j = sum;

        }

        System.out.println("피보나치 수열 20번째 항의 값은 = " + sum);



    }
}
