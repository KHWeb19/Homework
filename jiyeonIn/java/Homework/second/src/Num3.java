public class Num3 {
    public static void main(String[] args) {
        //3번 정수형 변수 2개에 랜덤값을 할당하고 출력합니다.

        int num1 = (int) (Math.random()*100);
        int num2 = (int) (Math.random()*500);

        System.out.printf("num1 = %d\nnum2 = %d",num1,num2);
    }
}