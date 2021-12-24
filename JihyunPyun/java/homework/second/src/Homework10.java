public class Homework10 {
    public static void main(String[] args) {
        int rand1 = (int)(Math.random() * 26 + 65);
        int rand2 = (int)(Math.random() * 25 + 97);
        System.out.println("65 ~ 90 범위의 랜덤값 : " + rand1);
        System.out.println("97 ~ 122 범위의 랜덤값 : " + rand2);
    }
}
