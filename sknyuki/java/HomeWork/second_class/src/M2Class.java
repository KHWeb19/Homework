public class M2Class {

    //첫번째,두번째 항과 n번째 항의 변수 선언
    int sum;
    int fibo1 = 1;
    int fibo2 = 1;

    public void printNum() {
        for (int i = 1; i <= 20 - 2; i++) {
            sum = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = sum;
            System.out.printf("피보나치%d번째 항은 %d입니다.\n", i + 2, sum);
        }
    }
}