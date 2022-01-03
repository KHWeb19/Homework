public class FloatDoublePrint {
    public static void main(String[] args) {
        float fnum1 = 3.3f;
        double funm2 = 7.7;
        // float는 숫자에 f를 붙여서 float 타입을 명시

        System.out.println("이런게 편해요 - fnum1: " + fnum1);
        System.out.println("이런게 편해요 - fnum2: " + funm2);

        System.out.printf("이런게 편해요 - fnum1: %f " , fnum1);
        System.out.printf("이런게 편해요 - fnum2: %f " , funm2);

        System.out.printf("fnum1 : %.2f", fnum1);

        //Q. 앞에 float이 붙어있는데 뒤에 f가 필요한 이유는?
        //A.

        // 변수란 무엇인가?
        // 1. 변하는 수: 30%
        // 2. 메모리 공간: 90%
        // 3. 값을 저장하는 공간: 70%

        // 특정한 데이터타입의 정보를 저장할 수 있는 메모리 공간 - C
        // 특정 데이터타입의 정보를 저장할 수 있는 공간 - JAVA

        // 이사: 사용하는 물건을 박스에 넣고 포장.
        // 박스 개념이 변수

        // 박스에 넣는 내용은 '=3' 과 같은 형식에 정보(실제 내용)임.

        // 현실에서는 박스에 넣고 싶은대로 막 넣을 수 있다.
        // 컴퓨터에서는 특정한 형태의 것을 넣을 수 있도록 만들어져 있다. (포함 개념도 존재하긴 함)
        // float 타입의 경우엔 소수점이고 double도 소수점이다.
        // 그러나 float는 4byte double은 8byte다.
        // 두 타입의 크기가 다르다.

        // float에 double 을 집어 넣을 수는 있으면 오버플로어가 발생함.
        // double의 타입이 float로 변함 (강제 형변화가 일어남)

        // double 타입은 숫자를 어떻게 표기하는지 알 필요가 있음.
        // float 타입은 f를 붙이게 되어있음.
        // double은 붙이지 않음.

        // Q . 소수점 제어를 하고자 할때 그냥 전부 double을 사용해도 되는가?
        // A . 사용하는데 문제는 없음
        //     그러나 성능은 float 보다 떨어지며 정밀도는 float보다 높다.


    }
}
