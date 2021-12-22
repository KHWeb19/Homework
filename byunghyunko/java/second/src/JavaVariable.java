public class JavaVariable {
    public static void main(String[] args) {
        // Java에서 변수를 만드는 방법
        // 1. 데이터타입(자료형)을 적는다
        // 2. 변수 이름을 작성한다
        // 3. 필요하다면 =3 등을 통해서 값을 할당한다(있어도 없어도 그만)

        // 데이터타입이란 ?
        // 정수형int, 실수형: floot, double
        // floot은 4byte, double은 8byte

        // byte 개념은?
        // 1byte=8bit

        // bit 개념은?
        // 컴퓨터에서 가장 작은 저장 단위로  0 혹은 1을 저장할 수 있음
        // 1byte - 8bit

        // 1bit는 몇 개의 숫자를 표현할 수 있을까?
        // 0 1 - 2개

        int num;

        num = 3;

        System.out.println("숫자 = " + num);
        System.out.printf("포맷 지정 숫자 = %d\n", num);
    }
}
