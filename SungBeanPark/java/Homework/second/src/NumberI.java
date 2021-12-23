public class NumberI {
    public static void main(String[] args) {
        System.out.println("65 ~ 90까지의 난수와 97 ~ 122까지의 난수를 무작위로 생성해봅시다.");

        int min1 = 65, max1 = 90;
        int min2 = 97, max2 = 122;

        System.out.println((int)(Math.random() * (max1 - min1 + 1) + min1));
        System.out.println((int)(Math.random() * (max2 - min2 + 1) + min2));
    }
}
