public class Q9_1 {
    public static void main(String[] args) {

        // 선생님의 풀이 방식 복습

        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;

        int sum = 0;
        int rand = 0;

        // isrand (랜덤값이 할당되었는지 여부를 판단)
        boolean isrand = false;

        for (int i = START; i <= END; i++){

            while (!isrand){
                rand = (int)(Math.random() * range + MIN);
                isrand = true;
            // 난수 값이 할당 되었으므로 반복을 멈춤
            }

            // 구해진 난수 값으로 배수 구하기
            if (i % rand == REMAIN){

                System.out.printf("%d의 배수: %d\n", rand, i);
                isrand = false;
                // 다시 난수를 할당시켜 반복시켜야 하므로 false를 만듦.

                sum += i;
            }


        }

        System.out.println("배수의 합 : " + sum);
    }
}
