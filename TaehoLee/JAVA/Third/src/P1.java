public class P1 {
    // 65 ~ 122 사이의 랜덤한 숫자 생성, 소문자나 대문자가 아니라면 다시 생성

    public static void main(String[] args) {
        final int MIN = 65;
        final int MAX = 122;
        int range = MAX - MIN + 1;
        int rand = (int)(Math.random() * range) + MIN;

        boolean isLetter = false;
        boolean isSmallLetter = rand >= 65 && rand <= 90;
        boolean isCapitalLetter = rand >= 97 && rand <= 122;

        while(!isLetter){
            if (isCapitalLetter || isSmallLetter){
            System.out.printf("문자 : %c", rand);
            isLetter = true;
            }
        }
    }
}
