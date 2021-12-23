import java.util.Random;

public class Q3 {
    public static void main(String[] args) {


        // 1
        System.out.println("정수형 변수 랜덤 값 1 : " + (int)(Math.random() * 100));

        // 2
        Random rand = new Random();
        System.out.println("정수형 변수 랜덤 값 2 : " + rand.nextInt(100));


    }
}