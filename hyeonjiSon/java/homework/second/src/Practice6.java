public class Practice6 {
    public static void main(String[] args) {
        //문제: 주사위 2개를 굴려서 눈금의 합을 출력해봅시다.

        int dice1 = (int)(Math.random() * 6 +1);
        int dice2 = (int)(Math.random() * 100 +1);

        System.out.println("주사위 두 개의 값을 합친 결과는? " + (dice1 + dice2));

    }
}
