public class JavaVariable {
    public static void main(String[] args) {
        //Java에서 변수 선언 하는법
        //1.테이터 타입(자료형)을 적는다.
        //2.변수의 이름을 작성한다
        //3.필요하다면 = 3등을 통해서 갑을 할당한다.

        //데이터타입
        //정수형:int 실수:float,double
        //float는 4byte, double은 8byte

        //byte=8bit

        //1bit=>0,1(2가지)
        //2bit=>00,01,10,11(4가지)

        int num;

        num = 3;

        System.out.println("숫자 = " + num);
        System.out.printf("포맷 지정 숫자 = %d\n", num);
        //printf=>파이썬 format().과 동일 
        //%d-정수형
        //%lf-소수점 실수형
        //%s-문자열
    }
}

//* 프로잭트 생성하는 방법
//*git에 pr넣기
//*git 작업시 주의 해야할 사항들 정리
//*기타 복습
