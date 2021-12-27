public class HW17 {
    public static void main(String[] args) {
        //컴퓨터와 주사위 게임을 해보자!
        //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.

        //1. 랜덤값 생성해서 합을 구함
        //   굴리는 횟수에 final 사용
        //2. 합을 비교해서 더 큰 쪽이 우승

        final int NUM = 2;
        int rand;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= NUM; i++) {
            rand = (int) (Math.random() * 6 + 1);
            sum1 += rand;
        }
        System.out.println("컴퓨터: " + sum1);

        for (int i = 1; i <= NUM; i++) {
            rand = (int) (Math.random() * 6 + 1);
            sum2 += rand;
        }
        System.out.println("나: " + sum2);

        if (sum1<sum2) {
            System.out.println("이겼습니다.");
        } else if (sum1>sum2) {
            System.out.println("졌습니다.");
        } else {
            System.out.println("동점입니다.");
        }
    }
}
