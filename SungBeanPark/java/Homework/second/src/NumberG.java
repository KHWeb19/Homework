public class NumberG {
    public static void main(String[] args) {
        System.out.println("주사위를 굴려서 홀수가 나오면 손모가지를 내놔라 출력");

        int dice8 = (int)(Math.random() * 6 + 1);

        if (dice8 % 2 == 1) {
            System.out.println(dice8);
            System.out.println("홀수! 손모가지 내놔!");
        }else{
            System.out.println(dice8);
            System.out.println("짝수! 퉤!");
        }
    }
}