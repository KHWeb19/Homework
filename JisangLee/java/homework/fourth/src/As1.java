public class As1 {
    // 65 ~ 122 사이의 랜덤한 문자를 생성
    // 소문자나 대문자가 아니라면 다시 생성
    public static void main(String[] args) {
        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;
        Boolean isChar = true;


        while (isChar) {

            int rand = (int) (Math.random() * range + MIN);
            //문자가 아니면 문자를 다시 생성하기 위해 랜덤 값이 필요하므로
            //와일 구문 안에 랜덤 함수가 있어야 함
            Boolean condition1 = rand >= 65 && rand <= 90;
            Boolean condition2 = rand >= 97 && rand <= 122;


            if (condition1 || condition2) {
                System.out.printf("소문자나 대문자를 생성: %c(%d)\n", rand, rand);
                isChar = false;   //문자가 나오면 false로 바뀌고
                break;   //와일문을 빠져 나온다.
            }
            System.out.println("문자를 다시 생성합니다.");
        }
    }
}

