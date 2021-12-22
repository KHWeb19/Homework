public class Practice8 {
    public static void main(String[] args) {
        //문제: 주사위를 굴려서 홀수가 나오면 손모가지를 내놔라 출력
        int dice = (int)(Math.random() * 6 +1);

        if (dice % 2 == 0){
            System.out.println("주사위 눈이" + dice + "라니... 짝수라서 봐준다.");
        } else {
            System.out.println("주사위 눈이" + dice + "라니, 홀수는 손모가지를 내놔라!");
        }
    }
}
