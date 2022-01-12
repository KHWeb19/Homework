public class InComeClass {
    public static void main(String[] args) {
        // 문제은행[3] - 7번
        // 연봉 인상률 1 ~ 10%

        InCome inCome = new InCome(); // 객체생성

        // 메인에서 출력해야하는 결과
        // 1. 매년 인상 후 결과

        inCome.init_income();

        for(int i =0; i < inCome.YEAR; i++) {
            System.out.println("결과 :" + inCome.money()+", 인상률: "+ inCome.random());
        }

    }
}
