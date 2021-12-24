public class Q8 {
    public static void main(String[] args) {

        // 주사위를 굴려서 홀수가 나오면 손모가지를 내놔라 출력

        int rand = (int)(Math.random()*10+1);

        if (rand % 2 == 1) {
            System.out.println("손모가지를 내놔라");
        } else {
            System.out.println(rand);
        }

    }
}
