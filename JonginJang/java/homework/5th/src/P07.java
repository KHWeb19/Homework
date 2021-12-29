public class P07 {
    public static void main(String[] args) {
/*7. 회사에 직원이 7명이 있습니다.
   모두 입사동기로 3500만원으로 시작하였다고 합니다.
   각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
   이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.
*/
        /*직원 7명 -> 7개의 요소를 가지는 배열, 3500만원으로 시작.

          5년 ->  루프 5번
          매 루프마다 각 요소에 난수로 결정된 인상률 적용해 요소값 최신화
         */
        final int ARRMIN = 0;
        final int ARRMAX = 7;
        final int STARTYEAR = 0;
        final int LASTYEAR = 5;
        //연봉인상률 1~10%
        final int MINSALARYINCR = 1;
        final int MAXSALARYINCR = 10;
        int salaryIncrDecision = 0;
        int range = MAXSALARYINCR-MINSALARYINCR+1;

        int[] salary = new int[ARRMAX];
        for(int i = ARRMIN; i<ARRMAX ; i++){
            salary[i] = 35000000;
        } // 직원 7명에 대한 연봉 초기값 지정
        System.out.println("=====================================================================");
        for(int j = STARTYEAR; j<LASTYEAR ; j++){
            System.out.println("!)  "+(j+1)+"년차");

            for(int k = ARRMIN ; k<ARRMAX ; k++){
                System.out.println("-------------------------------------------------------------");
                salaryIncrDecision = (int)(Math.random()*range+MINSALARYINCR); // 인상률 결정
                System.out.printf("%d번째 직원의 %d년차 연봉인상률은 %d퍼센트입니다\n",k+1,j+1,salaryIncrDecision);
                float rate = ((float)salaryIncrDecision)/100;
                salary[k] = (int)(salary[k] + (salary[k]*rate));
                System.out.printf("-> %d년차 연봉인상률이 반영된 %d번째 직원의 연봉은 %d원입니다.\n",j+1,k+1,salary[k]);
                System.out.println("-------------------------------------------------------------");
            }
        }
        System.out.println("=====================================================================");
    }
}
