public class Num7Again {
    public static void main(String[] args) {
         /*  회사에 직원이 7명이 있습니다.
            모두 입사동기로 3500만원으로 시작하였다고 합니다.
            각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
            이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다. */

        //배열 = 7개 // 시작연봉 3500 모두 맞추기 -> 배열에 값을 동일하게 다주기 for 문으로 간단하게 만들수있음
        //인상률 1~10퍼 -> 0.01~0.1
        //5년이후 -> for 5년반복 연봉합산 = sum // 5년동안 7명의 값 알아내기 이중for문

        final int COWORKER = 7;
        final int YEAR = 5;
        final int PAY = 3500;

        float [] emp = new float[COWORKER];

        final int MAX= 10;
        final int MIN = 1;
        int range = MAX - MIN +1;
        final float PERCENT = (float) 0.01;
        float percent = 0;

        for(int i=0;i<COWORKER;i++){
            emp[i] = PAY;
        }

        for(int i = 0;i<YEAR;i++){
            for(int j = 0;j<COWORKER;j++){
                percent = (float)((int)(Math.random()*range+MIN))*PERCENT;
                emp[j] += (emp[j]*percent);
                System.out.printf("%d직원 %d년차 인상률 : %f ,연봉 : %f\n",(j+1),(i+1),percent,emp[j]);
            }
        }
        System.out.println();
    }
} // 값은 아주 잘 나옵니다. 그런데 인상률이 0.01,0.02 이렇게만 나오고,소숫점둘째자리가 안나옵니다. 이유가 뭘까요?
