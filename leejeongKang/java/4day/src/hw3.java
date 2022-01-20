public class hw3 {

    // <배열로 로또 만들기>
    // 100명 중 5명이 당첨
    // 로또 배열값에 당첨되는 자리를 랜덤으로 배치하고
    // 사용자가 컴파일해서 당첨여부를 확인한다.

    /*
    1. int[] lotto = new int [100] 구현
    2.
    */



    public static void main(String[] args) {
        final int MAX = 100;
        final int MIN = 1;
        final int range = MAX - MIN + 1;
        final int lotto_win;

        int[] lotto = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            int rand = (int) (Math.random() * range + MIN);
            lotto[i] = rand;
            if (lotto[i] == rand) {
                System.out.println("당첨입니다.");
            } else
                System.out.println("꽝입니다.");
            System.out.println("");

        }

    }
}

