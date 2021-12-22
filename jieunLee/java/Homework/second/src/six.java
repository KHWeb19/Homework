public class six {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random()*6+1);
        int dice2 = (int)(Math.random()*6+1);
        int res = dice1 + dice2;
        System.out.printf("주사위 2개의 합: %d", res);
    }

}
