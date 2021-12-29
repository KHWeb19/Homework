public class ReHw1 {
    public static void main(String[] args) {
        // 아스키코드 상에서
        // 65~90 --> 대문자
        // 97~122 --> 소문자
        final int MIN = 65;
        final int MAX = 122;
        int range = MAX - MIN + 1;

        //조건2개를 쉽게 판별하기 위해 boolean을 쓰기
        boolean isChar = true;

        while(isChar){
            // 랜덤값 생성을 반복문 내에 써야지 계속 랜덤값이 바뀜
            int rand = (int)(Math.random() * range + MIN);

            boolean condition1 = rand >= 65 && rand <= 90;
            boolean condition2 = rand >= 97 && rand <= 122;

            if(condition1 || condition2){
                System.out.printf("rand는 대문자 혹은 소문자임 : %c(%d)\n", rand, rand);

                isChar = false;

                break;
            }

            System.out.printf("문자가 아님 : %c(%d)\n", rand, rand);

        }

    }
}

