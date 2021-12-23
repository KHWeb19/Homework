public class Homework08 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        System.out.println("주사위 : " + num);
        if(num % 2 == 1) {
            System.out.println("손모가지를 내놔라!");
        }
    }
}
