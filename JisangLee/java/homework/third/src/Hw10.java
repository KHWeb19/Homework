public class Hw10 {
    //1 ~ 100까지 숫자를 순회, 2 ~ 10 사이의 랜덤한 숫자를 선택
    //다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자 나온만큼 이동
    //이동했을 때 나온 숫자들의 합
    public static void main(String[] args) {
        int i;
        int rand;
        int sum;
        int sum2=0;
        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;
        rand = (int) (Math.random() * range + MIN);
        for (i = 0; i < 101; i++) {
            sum = i + rand;
            sum2 += sum;
            System.out.printf("%d이(가) %d만큼 이동: %d\n",i,rand,sum);
        }
        System.out.println("이동 거리의 합 = "+sum2);
    }

}
