public class ReHw10 {
    public static void main(String[] args) {
        /*
        1. 1~100 순회하는 for문
        2. 2~10 랜덤값 나오게
        3. 랜덤값만큼 이동
        4. 전체 이동 누산구하기

         */

        final int START = 1;
        final int END = 100;

        final int MIN = 2;
        final int MAX = 10;
        int range = MAX - MIN + 1;

        int rand = 0;
        int sum = 0;


        // 현재 위치는 난수 + 현위치여야하기 떄문에
        // 증감식에 i += rand 를 해야함
        for(int i = START ; i <= END ; i += rand){
            // 랜덤값을 구하는 것은 for문 내부에 있어야
            // 계속 반복해서 난수를 뽑을 수 있음
            // for문 외부에 있다면 한번 뽑은 난수로 계속 이어질거임
            rand = (int)(Math.random() * range + MIN);

            System.out.printf("뽑은 난수 : %d, 현재 위치 : %d\n", rand, i);

            sum += i;
        }
        System.out.printf("지금까지 이동한 총합 : %d\n", sum);
    }
}