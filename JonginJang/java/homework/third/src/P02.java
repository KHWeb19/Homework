public class P02 {
    public static void main(String[] args) {
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!
        //첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열


        int fibonacci1 = 1;
        int fibonacci2 = 1;
        int fibonacci3;

        System.out.printf("피보나치 수열의 1번째 항 = %d\n",fibonacci1);
        System.out.printf("피보나치 수열의 2번째 항 = %d\n",fibonacci2);

        for(int i=3;i<21;i++)
        {
            fibonacci3 = fibonacci1 + fibonacci2;
            System.out.printf("피보나치 수열의 %d번째 항 = %d\n",i,fibonacci3);
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci3;
        }
    }
}
