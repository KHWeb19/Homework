public class Homework5 {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random() * 6 + 1 ) ;
        int dice2 = (int)(Math.random() * 6 + 1 ) ;

        System.out.println("dice1 : " + dice1 );
        System.out.println("dice2 : " + dice2 );

        System.out.println("눈금의 합 : " + (dice1 + dice2));
    }
}
