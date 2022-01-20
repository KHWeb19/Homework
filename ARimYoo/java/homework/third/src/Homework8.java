public class Homework8 {
    public static void main(String[] args) {

        // 1 ~ 100까지 숫자를 순회.
        // 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력.

        int i = 0;
        int min = 2;
        int max = 10;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range + min);

        while (i < 100) {

            i += 1;

            if (i % rand == 0) {

                System.out.println(rand + "의 배수 값 : " + i);

            }


        }
    }
}
