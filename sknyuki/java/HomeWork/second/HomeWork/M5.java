public class M5 {
    public static void main(String[] args) {
        int Dice1= (int)(Math.random()*6+1);
        int Dice2= (int)(Math.random()*6+1);
        int Sum= Dice1+Dice2;

        System.out.printf("두 주사위의 합 %d\n",Sum);
    }
}
