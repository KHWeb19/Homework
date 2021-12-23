public class FloatDoublePrint {
    public static void main(String[] args) {
        float fnum1 = 3.3f;
        double fnum2 = 7.7;
        // float은 숫자에 f를 붙여서 float타입임을 명시함

        System.out.println("요런 게 편해요 - fnum1: " + fnum1 );
        System.out.println("요런 게 편해요 - fnum2: " + fnum2 );

        System.out.printf("얜 타입을 알아야함 - fnum1: %f\n", fnum1);
        System.out.printf("얜 타입을 알아야함 - fnum2: %f\n", fnum2);

        System.out.println("하지만 요런식으로 정밀 제어가 가능함");
        System.out.printf("얜 타입을 알아야함 - fnum1: %.2f\n", fnum1);
    }
}

//Q1. 앞에 float이 붙었는데 뒤에 f가 필요한 이유는 뭘까요?
//A.
/*
변수란 무엇인가?
- 특정한 데이터타입의 정보를 저장할 수 있는 메모리 공간 (C에서 맞는 말)
- 특정 데이터 타입의 정보를 저장할 수 있는 공간 (Java에서의 개념)


ex)
이사를 가려면?
- 우리가 사용하는 물건을 박스에 넣고 포장 (여기에서 박스의 개념이 변수)

박스에 넣는 내용은 '=3'과 같은 형식의 정보(실제 내용)임
현실에서는 박스에 넣고싶은 대로 물건을 넣을 수 있지만, 컴퓨터에서 박스의 개념은 조금 다르다.
특정한 형태의 것을 넣을 수 있도록 만들어져 있다. (포함 개념도 존재하긴 함)

float 타입의 경우엔 소수점이고 double도 소수점이다.
그러나 float는 4byte, double은 8byte다. (← 둘의 크기가 다르다.)
- 포함관계의 개념 때문에 넣을 수는 있지만 double의 타입이 float으로 강제로 바뀜
-여기서 float타입과  double 타입이 숫자를 어떻게 표기하는지 알 필요가 있다.

float 타입은 f를 붙이게 되어 있음
double은 붙이지 않음
 */

//Q2. 소수점 제어를 하고자 할때 그냥 전부 double을 써도 되는가?
//A. 사용하는데 문제는 없음. 그러나 float보다 성능은 떨어지고, 정밀도는 높다는 특징이 있음.
/*

 */
