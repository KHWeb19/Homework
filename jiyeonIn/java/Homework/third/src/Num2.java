public class Num2 {
    public static void main(String[] args) {
        //2. 피보나치 수열의 20번째 항을 구하는 프로그램 만들기

        //1,1,2,3,5,8,13,21,34,55,89,144
        int num1 = 1;
        int num2 = 1;
        System.out.println("1번째 : " +num1);
        System.out.println("2번째 : " +num2);

        for (int i=3;i<=20;i++){
            int num3 = num1+num2; //num3 = 1+1 =2 num4 = 1+2 num5 = 2+3
            System.out.println(i+"번째 : " +num3);
            num1 = num2; //그 전꺼 (직전꺼 + 그 전꺼 합하기)
            num2 = num3; //직전꺼
            //num1 과 num2 값 변경 시켜서 for문 다시 돌리기

        }
    }
}
