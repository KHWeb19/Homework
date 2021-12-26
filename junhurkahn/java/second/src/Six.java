public class Six {
    public static void main(String[] args) {
        int rand1 = (int)(Math.random()*6+1);
        System.out.printf("주사위1 : %d\n",rand1);
        int rand2 = (int)(Math.random()*6+1);
        System.out.printf("주사위2 : %d\n",rand2);

        int res = rand1 + rand2;
        System.out.printf("주사위1:%d + 주사위2:%d = %d",rand1,rand2,res);

    }
}
