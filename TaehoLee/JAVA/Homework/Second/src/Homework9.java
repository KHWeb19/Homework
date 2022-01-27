public class Homework9 {
    public static void main(String[] args) {
        //65에서 90까지의 난수와 97에서 122까지의 난수를 무작위로 생성해봅시다

        int num1 = (int) (Math.random() * 26) + 65, num2 = (int) (Math.random() * 26) + 97;

        System.out.printf("랜덤 난수 2개 : %d, %d", num1, num2);
    }
}
