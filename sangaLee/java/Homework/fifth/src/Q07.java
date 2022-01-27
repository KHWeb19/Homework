public class Q07 {
    public static void main(String[] args) {

        //7. 회사에 직원이 7명이 있습니다.
        //   모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //   각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        //   이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        // 7명이 3500만원 매년 1~10% 랜덤으로 오름
        // 7명 > final int값으로 지정
        // 배열 생성 - for문 작성 - 연봉이 3500이다
        // 연봉 인상률 랜덤 뽑기 작성
        // final int MIN, MAX, RANGE 값 지정
        // for문 작성 1년부터 시작해서 5년까지 오르는 연봉 인상률 랜덤으로 뽑기

        // ★★★ 질문
        // 배열 생성했는데 왜 맨 위에 import를 지정안해도 오류가 안나는건가요?



        final int SLAVE = 7;
        int[] SlaveArray = new int[SLAVE];

        for (int i=0; i<SLAVE; i++) {
            SlaveArray[i] = 3500;
        }

        final int MIN = 1; final int MAX = 10; final int RANGE = MAX - MIN + 1;

        for (int i=1; i<6; i++){

            System.out.printf("%d\n년 후 연봉입니다.", i);

            for (int k=0; k<SLAVE; k++) {

                int SlaveLevelup = (int)(Math.random()*RANGE+MIN);
                SlaveArray[k] += (int)(SlaveArray[k]*(SlaveLevelup*0.01));
                System.out.printf("노비의 연봉이 %d퍼 올랐습니다. %d\n", k+1, SlaveLevelup,SlaveArray[k]);

            }
        }


    }
}
