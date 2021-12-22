public class Homework9 {
    public static void main(String[] args) {

        // 65~90까지의 난수와 97~122까지의 난수 생성

        int rand1 = (int)(Math.random() * 26 + 65);
        int rand2 = (int)(Math.random() * 26 + 97);

        System.out.println("rand1 = " + rand1);
        System.out.println("rand2 = " + rand2);
    }
}
