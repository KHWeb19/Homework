public class Test2 {
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!

        // 피보나치 수열이란 두 항을 1과 1로 한 후 그 다음 항부터는
        // 바로 앞의 두 개의 항을 더해 만드는 수열이다.
        // An= An-1 + An-2 이라는 식을 가지고 온다.
        // n번째 항을 구하기 위해서는 전항과 전전항을 기억 하고 있어야 한다.

        int num1 =1; // An-1
        int num2 =1; // An-2
        int num3;

        for(int i=3; i<21; i++){
            num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }

    }
}
