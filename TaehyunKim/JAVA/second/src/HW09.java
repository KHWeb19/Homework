public class HW09 {
    public static void main(String[] args) {
        // 9. 4~97까지의 랜덤숫자 생성

        System.out.println("9. 4~97까지의 랜덤숫자 생성");

        int min = 4;
        int max = 97;

        int a = (int) (Math.random() * (max - min +1) + min);

        System.out.printf("랜덤숫자(4~97) : %d", a);
    }
}
