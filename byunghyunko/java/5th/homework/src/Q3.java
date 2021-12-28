public class Q3 {
    /*
    public static void main(String[] args) {
        //3. 배열로 로또 문제를 만들어보기!
        //실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        //배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        final int ARRMAX = 100; // 100명중에서
        final int MAX = 5;
        final int MIN = 0;

        int range = MAX - MIN + 1; // 5명을 뽑기위한 범위작성

        int[] arr = new int[ARRMAX]; // 배열 작성

        //Q질문. 5명을 배치해서 당첨되는지 안되는지를 구하기 위한 코드작성을 못하겠습니다

        int randIdx0, randIdx1, randIdx2, randIdx3, randIdx4, cnt = 1;

        for (; cnt <= 5; cnt++) {
            // 임의의 배열 인덱스를 선택하도록 지원
            randIdx0 = (int) (Math.random() * ARRMAX);
            randIdx1 = (int) (Math.random() * ARRMAX);
            randIdx2 = (int) (Math.random() * ARRMAX);
            randIdx3 = (int) (Math.random() * ARRMAX);
            randIdx4 = (int) (Math.random() * ARRMAX);


            // 실제 임의의 배열 인덱스에 접근하여 랜덤 값을 배치함
            arr[randIdx0] = (int) (Math.random() * range + MIN);
            System.out.printf("당첨: %d,%d,%d,%d,%d, arr[randIdx] = %d\n", randIdx0, randIdx1, randIdx2, randIdx3, randIdx4, arr[randIdx0, randIdx1, randIdx2, randIdx3, randIdx4])
            ;
        }
    }
}

