public class M2 {
    public static void main(String[] args) {
        //첫번째,두번째 항과 n번째 항의 변수 선언
        int fibo1,fibo2,sum;
        fibo1=1;
        fibo2=1;


        for(int i=1; i<=20-2; i++){
            sum=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=sum;
            System.out.printf("피보나치%d번째 항은 %d입니다.\n",i+2,sum);


        }
    }
}
