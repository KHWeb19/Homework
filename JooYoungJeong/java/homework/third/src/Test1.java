public class Test1 {
    public static void main(String[] args) {

        //65 ~ 122 사이의 랜덤한 문자를 생성
        //소문자나 대문자가 아닐경우 다시 생성

        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;
        int rand = (int) (Math.random() * range + MIN);






                System.out.printf("문자: %c\n", rand);

            }
        }