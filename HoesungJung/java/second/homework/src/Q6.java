public class Q6 {public static void main(String[] args) {
    int dice1 = (int)(Math.random()*6+1), dice2 = (int)(Math.random()*6+1);
    System.out.println("주사위 1: "+dice1);
    System.out.println("주사위 2: "+dice2);

    System.out.println("몇 칸 이동? "+(dice1+dice2));
}
}
