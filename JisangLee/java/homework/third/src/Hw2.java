public class Hw2 {
    //1,1,2,3,5,8,13,21,34,55,89,...피보나치 수열의 20번째 항 출력
    public static void main(String[] args) {
        int num1 = 1;
        System.out.println("1번째의 항: "+ num1);
        int num2 = 1;
        System.out.println("2번째의 항: "+ num2);
        int i;
        for(i = 3; i<21; i++ ){
            int sum = num1 + num2;
            System.out.printf("%d번째의 항: %d\n",i,sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
