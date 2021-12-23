public class NumberE {
    public static void main(String[] args) {
        System.out.println("주사위 2개를 굴려서 눈금의 합을 출력해봅니다.");

        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);

        System.out.printf("dice + dice2 = %d", dice1 + dice2);
    }
}
