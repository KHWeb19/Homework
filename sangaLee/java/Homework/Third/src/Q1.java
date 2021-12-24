public class Q1 {
    public static void main(String[] args) {

        //65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
        //여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자

        int ran;
        ran = (int) (Math.random() * 58 + 65);

        if (65 <= ran && ran <= 90) {
            System.out.printf("%c는 소문자가 아니므로 다시 생성하시오", ran, ran);
        }

        if (97 <= ran && ran <= 122) {
            System.out.printf("%c는 대문자가 아니므로 다시 생성하시오", ran, ran);
        }

    }
}

