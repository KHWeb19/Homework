public class Practice2 {
    public static void main(String[] args) {
       // 문제: 정수형 변수 1개, float 변수 2개, double 변수 3개에
        // 아무 값이나 할당하고 출력합니다.
        int num1 = 5;
        float num2 = 2.2f, num3 = 3.3f;
        double num4 = 6, num5 =7.7, num6 = 8.1;

        System.out.println("정수형 변수 num1 = " + num1);
        System.out.println("float형 변수 num2 = " + num2);
        System.out.println("float형 변수 num3 = " + num3);

        System.out.println("double형 변수 num4 = " + num4 + "num5 = " + num5 + "num6 = " + num6);

        //↓ printf를 사용하여 num4, num5, num6을 한 문장 안에 출력하기!

        System.out.printf(
                "printf로 더블형 변수 출력 num4 = %f, num5 = %f, num6 = %f\n",
                num4, num5, num6
        );

        // ↑ 선생님 수업시간에 %lf 가 float, double 소수점 출력한다고 배웠는데
        // 막상 쳐보니까 뭔가 오류가 발생하는 것 같았습니다.
        // 검색해보니 %f가 부동소수점의 형식으로 출력하는 지시자라고 나와서
        // 일단 그렇게 작성하였는데 이게 맞는 걸까요?

        /* printf 1차시도

        System.out.printf(
                "double형 변수 num4 = %d, num5 = %d, num6 = %d\n",
                num4, num5, num6
        );
        ↑ 왜 적용이 안된거지?
          - %d는 정수를 출력하는 지시자이기 때문에 double을 출력하지 못했다!
        */

    }
}
