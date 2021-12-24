public class Test7 {
    public static void main(String[] args) {

        //주사위를 굴려서 짝수인 경우 "당첨입니다!" 출력
        //주사위를 굴려서 홀수인 경우 "손모가지를 내놔라" 출력

        int dice1 = (int)(Math.random() * 6 + 1);

        if (dice1 % 2 == 0){
            System.out.println("당첨입니다! : " + dice1);
        } else {
            System.out.println("손모가지를 내놔라 : " + dice1);
        }
    }
}
