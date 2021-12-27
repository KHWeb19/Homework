public class HomeworkB {
    public static void main(String[] args) {
        //2. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!
        // 피보나치 수열
        int num1 = 0;
        int num2 = 1;

        int res = 0;
        for(int i = 0; i<21; i++){ // 20번 반복

            res = num1 + num2;
            System.out.printf("%d ,", res);
            num1 = num2;
            num2 = res;
        }

    }
}
