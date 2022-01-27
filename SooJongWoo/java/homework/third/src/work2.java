public class work2 {
    public static void main(String[] args) {
        // 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!
        int num1 = 1;
        int num2 = 1;
        int num3;

        System.out.println(num1);
        System.out.println(num2);

        for(int i=1; i<=18; i++){
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
