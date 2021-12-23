public class Test6 {
    public static void main(String[] args) {

        //주사위 2개를 굴려서 눈금의 합을 출력

        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);
        int dice3 = (dice1 + dice2);

        System.out.println("주사위 두 개의 합 = " + dice3);

    }
}
