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

        //num1 ~ num4 의 값이 제대로 설정 된건지
        //if (num1 <= num2) else 를 제대로 사용한건지
        //문제에서 원하는 바를 제대로 해낸건지 하나도 모르겠습니다
    }
}

