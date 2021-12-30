public class reviewWork3_1 {
    public static void main(String[] args) {
        final int MAX_NUM = 5;

        int[] Lotto =  new int[MAX_NUM];

        final int MAX = 45;
        final int MIN = 1;

        int range = MAX - MIN + 1;

        for (int i = 0; i < MAX_NUM; i++) {
            Lotto[i] = (int)(Math.random() * range + MIN);
                for (int j = i - 1; j >= 0; j--) {
                    if (Lotto[i] == Lotto[j]) {
                        System.out.print("(중복발생!)");
                        i--;
                        break;
                    }
                }
            System.out.printf("당첨 번호 : %d\n", Lotto[i]);
        }

    }
}
/*  1. 100명 중 5명 이므로 MAX를 45로 잡고 MAX_NUM을 5로 MIN은 1로 잡기.
    2. 범위는 1 ~ 45까지 for문을 돌려서 반복하면서 Math.random()으로
       무작위 숫자를 생성
    3. MAX_NUM만큼의 배열의 길이를 만들어주기
    4.  현재 중복이 발생되는 부분에서 숫자를 한번 더 출력하는 부분이 있어 확인 후 수정하기.
 */