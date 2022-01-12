public class JavaVariable {
    public static void main(String[] args) {
        // Java에서 변수를 만드는 방법
        // 1. 데이터타입(자료형)을 적는다.
        // 2. 변수 이름을 작성한다.
        // 3. 필요하다면 = 3 등을 통해서 값을 할당한다. (있어도 그만 없어도 그만)

        // 데이터타입이란?
        // 정수형 : int (4byte) , 실수형 : float, double
        // float은 4byte, double은 8byte

        // byte 개념은?
        // 1byte = 8bit

        // bit 개념은?
        // 컴퓨터에서 가장 작은 저장 단위로 0 혹은 1을 저장할 수 있음
        // 1byte - 8bit

        // 1bit는 몇 개의 숫자를 표현할 수 있을까?
        // 0, 1 - 2개

        // 2bit는?
        // 00, 01, 10 - 4개

        // 3bit는?
        // 000, 001, 010, 011, 100, 101, 110, 111 - 8개

        // 4bit는?
        // 16개 (2의 n승씩 하면 됨)

        // 데이터타입에 숫자 제한이 걸리는 이유는 비트 시스템 때문.
        // 이런 이유로 BigInteger라는 데이터타입 존재

        // println - 자동엔터 (개행)

        // printf - 포맷 형식 지정 할 수 있음
        // 포맷 == 양식 -> 특정 양식을 지정하고 그 양식에 적합한 출력
        // %d - 정수출력
        // %lf - float, double 소수점 출력
        // %s - 문자열 -> 반드시 쌍따옴표로 감싸줘야함
        // \n - 개행문자로 엔터와 같은 역할


        int num;

        num = 3;

        System.out.println("숫자 = " + num);
        System.out.printf("포맷 지정 숫자 = %d\n", num);

    }
}
