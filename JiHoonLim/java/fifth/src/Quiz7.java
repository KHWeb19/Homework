public class Quiz7 {
    public static void main(String[] args) {
        /*
        1. 첫 for문에서 직원 7명의 연봉 넣기
        2. 두번째 for문에서 5년치 연봉 인상하기
        3. 출력하기

        질문 : 첫 for문에서 직원의 연봉을 넣고
        두번째 for문에서 인상 작업을 하고 싶은데 막혔습니다.
         */
        final int PEO = 7;
        final int YEAR =5;
        final int START = 35000000;

        final int MAX = 10;
        final int MIN = 1;

        int range = MAX - MIN +1;
        int i,j;

        int[] sar= new int[PEO];

        int random;

        for (i = 0; i < PEO; i++){
            sar[i] = START;

            for (j = 0; j < YEAR; j++){
                random = (int)(Math.random()* range + MIN);
                sar[j] += (float)(0.01 * random) * sar[j] ;
                System.out.printf("%d번 직원의 인상률은 %d%% 현재 연봉은 %d\n", i+1,random ,sar[j]);
            }
        }
    }
}
