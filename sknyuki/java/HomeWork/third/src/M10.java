public class M10 {
    public static void main(String[] args) {
        //2~10사이의 랜덤 숫자를 추출해내고 0~100까지의 랜덤 숫자를 n번 추가적으로 추출후 더해갔을때 최종 값
        //내 풀이
        /*int random1=0;
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i <= 100; i++) {
            random1 = (int) (Math.random() * 9 + 2);
            sum += random1;
            sum2 += sum;
            System.out.printf("100까지 2~10의 랜덤 값 %d번 만큼 합산한 값은%d이며, 이들의 총합은 %d이다.뽑은수는%d이다\n.",i,sum,sum2,random1);
        */

          /*  1 ~ 100까지의 숫자를 순회한다.
            9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
            다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
            이동했을때 나온 숫자들의 합을 계산하도록 만들어보자! */
        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        //범위 설정
        int decision= 0;
        int sum = 0;
        //decision,sum값 초기화
        for (int i = START; i <= END; i += decision) {
            // 내부에 배치되면 매 반복마다 더하는 값이 바뀜
            // 외부에 배치할시 매 루틴에 새로운 랜덤값이 아닌 처음 부여된 random값으로 무한 돌리게됨
            // decision값 만큼 더해감
            decision = (int) (Math.random() * range + MIN);

            System.out.printf("뽑은 난수 = %d, 현재 이동한 위치 = %d\n", decision, i);


            sum += i;
        }

        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}

