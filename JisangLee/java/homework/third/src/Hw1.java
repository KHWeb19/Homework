public class Hw1 {
    //65 ~ 122 사이의 랜덤한 문자 생성 후 소문자 대문자가 아니라면 다시 생성하도록~
    public static void main(String[] args) {

        final int MAX = 122;
        final int MIN = 65;
        int range = MAX - MIN + 1;
        int rand = (int) (Math.random() * range + MIN);

        if ((rand >= 65 && rand <= 90) || (rand >= 97 && rand <= 122)) {
            System.out.printf("랜덤한 소문자나 대문자를 생성: %c\n", rand);
            }

        else {
                System.out.println("랜덤한 문자를 다시 생성합니다.");
        }
    }
}




