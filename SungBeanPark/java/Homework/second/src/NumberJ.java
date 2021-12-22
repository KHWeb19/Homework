public class NumberJ {
    public static void main(String[] args) {
        System.out.println("65 ~ 122까지의 난수를 무작위로 생성하고 65 ~ 90 혹은 97~122에 해당하는 숫자만 출력해봅시다.");

        int min3 = 65, max3 = 122;
        int max4 = 90, min5 = 97;

        System.out.println((int)(Math.random() * (max3 - min3 + 1) + min3));

        int num = (int)(Math.random() * (max3 - min3 + 1) + min3);

        if (num <= 90) {
            System.out.println((int)(Math.random() * (max4 - min3 + 1) + min3));
        } else {
            System.out.println((int)(Math.random() * (max3 - min5 + 1) + min5));
        }
    }
}
