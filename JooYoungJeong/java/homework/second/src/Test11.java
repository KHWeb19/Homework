public class Test11 {
    public static void main(String[] args) {

        // 65 ~ 122 까지의 난수를 무작위로 생성하고
        // 65 ~ 90 혹은 97 ~ 122 에 해당하는 숫자만 출력
        // 91 92 93 94 95 96 제외

        int num1 = (int) (Math.random() * 58 + 65);
        int num2 = (int) (Math.random() * 29 + 65);

        int num3 = (int) (Math.random() * 26 + 65);
        int num4 = (int) (Math.random() * 26 + 97);

        if (num1 <= num2) {
            System.out.println("65 ~ 90 의 숫자 : " + num3);
        } else {
            System.out.println("97 ~ 122 의 숫자 : " + num4);
        }
    }
}

