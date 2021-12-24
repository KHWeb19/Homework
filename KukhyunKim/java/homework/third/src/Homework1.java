public class Homework1 {
    public static void main(String[] args) {
        // 65~122 사이의 랜덤한 문자를 생성하도록 한다.
        // 여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자.
        final int MAX =122;
        final int MIN =65 ;

        int range = MAX -MIN + 1;
        int rand = (int)(Math.random() * range + MIN);

        if (rand >= 65) {
            if(rand <=90) {
                System.out.printf("대문자 범주: %c(%d)\n", rand, rand);
            }
        }
        if(rand >= 97){
            if(rand <= 122){
                System.out.printf("소문자 범주: %c(%d)\n", rand, rand);
            }
        }


    }
}
