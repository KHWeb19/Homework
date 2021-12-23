public class NumberB {
    public static void main(String[] args) {
        System.out.println("정수형 변수 2개에 랜덤값을 할당하고 출력합니다.");

        int rand = (int)(Math.random() * 100);
        int rand2 = (int)(Math.random() * 100);

        System.out.println("rand = " + rand);
        System.out.println("rand2 = " + rand2);
    }
}