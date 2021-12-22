public class Homework6 {
    //주사위 두개를 굴려서 짝수인 경우 당첨입니다 출력

    public static void main(String[] args) {
        int dice = (int)(Math.random() * 6 + 3);

        if (dice % 2 == 0){
            System.out.println("당첨입니다!");
        }
        else{
        }
    }
}
