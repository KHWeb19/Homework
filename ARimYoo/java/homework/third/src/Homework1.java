public class Homework1 {
    public static void main(String[] args) {

        // 65 ~ 122 사이의 랜덤한 문자를 생성.
        // 소문자나 대문자가 아니라면 다시 생성

        int min = 65;
        int max = 122;
        int range = max - min + 1;

        int rand = (int) (Math.random() * range + min);


        if (rand >= 65 && rand <= 90 || rand >= 97 && rand <= 122) {

            System.out.printf("rand = %c", rand);

        } else {

            // 랜덤값이 91~96인 경우 계속해서 랜덤값을 구한다.
            while (rand > 90 && rand < 97) {

                rand = (int) (Math.random() * range + min);

            }
        }
    }
}
