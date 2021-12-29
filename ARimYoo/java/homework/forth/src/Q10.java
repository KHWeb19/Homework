public class Q10 {
    public static void main(String[] args) {

        // 1 ~ 100까지의 숫자를 순회한다.
        // 9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
        // 다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
        // 이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!

        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;

        int rand;
        int sum = 0;

        // 순회한다 = for문 사용
        // i는 다음번 순회때 rand만큼 이동한 값을 가지니 증감 부분에 i = i + rand
        for(int i = START; i <= END; i += rand){

            // 2~10까지의 랜덤값을 구한다
            rand = (int)(Math.random() * range + MIN);

            System.out.printf("뽑은 난수 : %d, 현재 위치 : %d\n", rand, i);

            // 뽑아서 나온 수들의 합
            sum += i;

        }

        System.out.println("나온 배수들의 합 = " + sum);

    }
}
