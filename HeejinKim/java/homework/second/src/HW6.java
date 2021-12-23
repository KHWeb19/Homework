public class HW6 {
    public static void main(String[] args) {
        int r1 =(int) (Math.random()*6+1);
        int r2 =(int) (Math.random()*6+1);

        int sum;
        sum= r1+r2;


        System.out.printf("주사위 1번 값:%d \n주사위 2번 값:%d\n",r1,r2);
        System.out.println("주사위의 합:" +sum);

    }
}
