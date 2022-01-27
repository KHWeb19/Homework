public class JavaVariable {
    public static void main(String[] args) {
        //java에서 변수 만들기
        //1. 데이터타입(자료형)을 적는다.
        //2. 변수 이름 작성한다.
        //3. 필요하다면 =3 등을 통해서 값을 할당한다

        //데이터 타입이란?
        // 정수형 : int, 실수형 : float, double
        //float는 byte, double 8byte

        //byte?
        //1byte = 8bit

        //bit?
        //컴퓨터에서 가장 작은 저장 단위로 0 or 1을 저장할 수 있음
        //0,1 두개

        //2bit?
        //00, 01 10 11
        //nbit = 2^n
        int num;

        num=3;

        //println = 자동 엔터(개행)
        //printf - 포멧 형식 지정 (포멧을 지정한다는것 : 양식을 지정한다.)

        //%d 정수, %lf 플롯/더블, %s 문자열.

        System.out.println("숫자 = " + num);
        System.out.printf("포맷 지정 숫자 = %d \n", num);
    }
}