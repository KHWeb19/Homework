public class Num6 {
    public static void main(String[] args) {
        //6.주사위 두개 굴려서 합 출력

        int num1 = (int) (Math.random()*6+1);
        int num2 = (int) (Math.random()*6+1);

        int sum = num1 + num2;

        System.out.printf("첫번째 주사위 = %d\n두번째주사위 = %d\n총 합 = %d",num1,num2,sum);


    }
}
