public class Q8번문제 {
    public static void main(String[] args) {
        // 주사위를 굴려서 홀수가 나오면 손모가지를 내놔라 출력

        int dice1 = (int)(Math.random() * 6 + 1);
        if(dice1 % 2 ==1) {
            System.out.println("손모가지를 내놔라");
        }
    }
}
