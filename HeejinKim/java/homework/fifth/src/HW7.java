public class HW7 {
    public static void main(String[] args) {
        // 회사에 직원이 7명이 있습니다.
        // 모두 입사동기로 3500만원으로 시작하였다고 합니다.
        // 각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        // 이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        //1.7개의 배열을 만든다
        //2.매년 인상률이 랜덤하다...랜덤으로 돌리자
        //3.5년후라고 하면 (1년후의 연봉+ 랜덤 인상률)을 반복해주자
        //4.다시 생각
        //1번째-- 1번째 연봉
        //2번째--(1번째 연봉*인상률)+ 1번째 연봉
        //3번째--(2번째 연봉*인상률)+ 2번째 연봉
        //4번째--(3번째 연봉*인상률)+ 3번째 연봉


        final double MAX = 0.1;
        final double MIN = 0.01;
        final int PEOPLE = 7;

        double first=3500;
        double up;
        double[] arr = new  double[PEOPLE];
        double range = MAX - MIN + 1;
        double result =0;
        double second;

        //int up= (int)((Math.random()+MIN)*START);//이번년에 얼마만큼 올랐는지의 연봉인상 값

        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 5; j++) {
                 up = ((Math.random() + MIN));
                 second = first*up + first;
                 first=second;
                 //second=result;

                arr[i]=second;
                System.out.println(arr[i]+result);


                //-----헛소리-----(고치기전의 생각)
                //인상률
                //arr[i] = up + START;//2번째 연봉
                //3번째 연봉을 구하려면
                //third= (arr[i] *(int)((Math.random() + MIN)) + arr[i]);
            }
            System.out.println(result);

            //한문제한문제를 너무 오래끌어서 다른 문제들은 시간이 없어서 못햇습니다.....ㅠㅠ
        }
    }
}
