public class HW08 {
    public static void main(String[] args) {
        // 8. 주사위 굴려서 홀수가 나오면 손모가지를 내놔라 출력

        System.out.println("\n8. 주사위 굴려서 홀수가 나오면 손모가지를 내놔라 출력");

        int a = (int) (Math.random() * 6 +1);

        if (a%2 == 1) {
            System.out.println("손모가지를 내놔라");
        }
        else{
            System.out.println("손모가지를 가져가라");
        }
    }
}
