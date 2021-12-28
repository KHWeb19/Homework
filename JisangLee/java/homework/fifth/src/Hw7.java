public class Hw7 {
    public static void main(String[] args) {
        //회사에 직원이 7명이 있습니다.
        //모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        //이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        //직원이 7명이니 배열을 7개 할당하면 되겠군..
        //3,500만원을 초기값으로 설정하면 되는건가...
        //각자의 연봉 인상률이 매년 1 ~ 10%니 랜덤함수를 사용하면 되겠군...
        //5년 후에 받을 연봉이니 매년 연봉에서 인상률을 곱하고 다음 해는 인상된 연봉에 인상률을 곱해야겠군...

        final int START = 1;
        final int END = 7;

        final int MAX = 10;
        final int MIN = 1;
        int range = MAX - MIN +1;

        int[] employee = new int[END];


        int salary = 35000000; //연봉의 초기값
        for(int i = START-1; i < END; i++ ){ //배열은 0부터 시작하므로 START값에서 1을 빼준다...
            employee[ i ] = salary;  //첫 해 받는 연봉

            for(int j=2; j<=5; j++ ){  //첫 해는 받았으므로 j=2부터 수행, 5년 후 연봉이므로...
                int rand = (int)(Math.random() * range + MIN);
                employee[i] = salary + (salary * rand/100);
            }
            System.out.printf("arr[%d] = %d원\n", i, employee[i]);
        }

    }
}
