public class P06 {
    public static void main(String[] args) {

        int dice1 = (int)(Math.random()*6+1);
        int dice2 = (int)(Math.random()*6+1);

        System.out.printf("첫 번째 주사위값  = %d, 두 번째 주사위값 = %d, 두 눈금의 합 = %d\n",dice1, dice2, dice1 + dice2);

    }
}
