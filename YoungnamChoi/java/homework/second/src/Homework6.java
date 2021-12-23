public class Homework6 {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);


        int res= dice1+dice2;
        System.out.println("주사위 눈금의 합 ="+res);

    }
}
