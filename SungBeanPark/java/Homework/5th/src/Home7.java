//회사에 직원이 7명이 있습니다.
//   모두 입사동기로 3500만원으로 시작하였다고 합니다.
//   각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
//   이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

// 회사에 직원이 7명이 있다  int num = 7; 때려박고
// 각각 3500만원이므로 7배열만들고 각각 3500넣어준다
// 각각 rand으로 1~10%인가?
// rand = 1~10%;
// 초봉 += 초봉(3500) * rand; 5번
public class Home7 {
    public static void main(String[] args) {
        final int MIN = 10;
        final int MAX = 1;
        final int RANGE = MAX - MIN + 1;
        final int year = 5;
        final float percentage = 0.01f;
        int num = 7;

        int[] salary = new int[num];

        for(int i = 0; i < num; i++){
           salary[i] = 35000000;
        }

        for(int i = 1; i <= year; i++){
            System.out.printf("%d년차\n", i);
            for(int j =0 ;j < num; j++){
                int ran = (int)(Math.random()* RANGE + MIN);
                salary[j] += salary[j] * ran * percentage;
                System.out.printf("직원 %d의 연봉 %d퍼센트 상승, %d년차 연봉: %d\n", j+1, ran, i, salary[j]);
            }
        }
    }
}

