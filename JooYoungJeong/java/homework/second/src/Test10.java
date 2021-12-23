public class Test10 {
    public static void main(String[] args) {

        // 65 ~ 90 까지의 난수와 97 ~ 122 까지의 난수 무작위 생성

        int rand1 = (int)(Math.random() * 26 + 65);
        int rand2 = (int)(Math.random() * 26 + 97);

        System.out.println("65 ~ 90 까지 난수 = " + rand1);
        System.out.println("97 ~ 122 까지 난수 = " + rand2);

    }
}
