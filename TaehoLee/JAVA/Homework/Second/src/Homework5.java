public class Homework5 {
    //주사위 두개를 굴려서 눈금의 합을 출력해봅시다.

    public static void main(String[] args) {
        int dice1 = (int)(Math.random() * 6 + 1), dice2 = (int)(Math.random() * 6 + 1);

        System.out.printf("주사위 두개의 눈금의 합을 출력합니다 : %d", dice1 + dice2);
    }
}
