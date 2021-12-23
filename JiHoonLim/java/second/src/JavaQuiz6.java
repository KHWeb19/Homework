public class JavaQuiz6 {
    public static void main(String[] args) {

        int dice1 = (int)(Math.random()*6+1);
        int dice2 = (int)(Math.random()*6+1);
        int sum = dice1 + dice2 ;

        System.out.println("주사위를 굴립니다.");
        System.out.println("첫 번째 주사위 값은 " +dice1);
        System.out.println("두 번째 주사위 값은 " +dice2);
        System.out.println("두 주사위의 눈금의 합은 " +sum);
    }
}
