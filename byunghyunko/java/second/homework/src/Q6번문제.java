public class Q6번문제 {
    public static void main(String[] args) {
        // 6. 주사위 2개를 굴려서 눈금의 합을 출력해봅시다.

        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);
        int res = dice1 + dice2;

        System.out.println("주사위 눈금의 합 = " +res);




    }
}
