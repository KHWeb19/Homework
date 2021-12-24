public class Hw3 {
    //1,1,1,2,3,4,6,9,13,19,28,41,60,88,129,규칙을 찾아 25번째 항을 출력
    public static void main(String[] args) {
        int i;
        int num1 = 1;
        System.out.println("1번째의 항: "+ num1);
        int num2 = 1;
        System.out.println("2번째의 항: "+ num2);
        int num3 = 1;
        System.out.println("3번째의 항: "+ num3);
        int num4 = 2;
        System.out.println("4번째의 항: "+ num4);
        for(i=5;i<26;i++){
            int sum = num1+num2+num3;
            System.out.printf("%d번째의 항: %d\n",i,sum);
            num1 = num2;
            num2 = num3;
            num3 = num4;
            num4 = sum;
        }


    }
}
