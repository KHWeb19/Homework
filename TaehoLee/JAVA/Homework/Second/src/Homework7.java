public class Homework7 {
    //주사위 두개를 굴려서 홀수인 경우 손모가지를 내놔라 출력

    public static void main(String[] args) {
        int dice = (int)(Math.random() * 6 + 3);

        if (dice % 2 == 1){
            System.out.println("손모가지를 내놔라");
        }
        else{
            ;
        }
    }
}
