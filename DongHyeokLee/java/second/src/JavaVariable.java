public class JavaVariable {
    public static void main(String[] args) {
                //JAVA에서 변수를 만드는 방법
                //1.데이터타입(자료형)을 적는다.
                //2.변수 이름을 작성한다.
                //3. 필요하다면 = 3 등을 통해서 값을 할당한다.

                //데이터 타입이란?
                // 정수형 int(4byte)  실수형 float double
                //float = 4byte double = 8byte

                //byte? 1byte = 8bit

                //bit? 컴퓨터에서 가장 작은 저장 단위로 0혹은 1을 저장할 수 있음
                // 1byte - 8bit

                // 1bit 는 몇개의 숫자를 표현할 수 있을까?
                // 0.1 ->2개
                // 0 , 01 , 10 ,11 - 4개  <- 2bit
                // 000, 001, 010, 011, 100, 101, 110 ,111 - 8개 <-3bit
                //4bit <- 16개개

                //5bit ... 32bit(4byte)
                // 2^32 = 42억9천만

                //BigInteger라는 매우큰 숫자를 처리할 수 있는 별도의 데이터 타입도 존재

                //데이터타입에 숫자 제한이 걸리는 이유는 결국 비트 시스템 떄문이다.


                int num;

               num = 3;

               //println()과  printf()의 차이점
               //print 가 들어가면 전부 출력
               //ln이 들어있으면 자동 엔터 (개행)
               // f가 들어있으면 포맷 형실을 지정할 수 있음

               // 포맷 형실을 지정한다는 것?
               // 포맷 == 양식
                //특정 양식을 지정하고 그 양식에 적합한 출력을 생성해준다는 뜻
                // %d - 정수출력
                // %lf - float , double 소수점 출력
                // %s - 문자열
                // 문자열은 반드시 쌍다옴표로 감싸줘야함
                // ex)"test 는 물자열이 아님 / "test hi hi hello dfjsk   "는 물자열임

                // \n은 개행 문자로 엔터와 같은 역할은 한다
                 System.out.println("숫자 = " + num);
                System.out.printf("포멧 지정 숫자 =%d\n ", num);



     }

}

// 프로젝트 생성 방법
// git에 PR 넣기
// git 작업시 주의할 사항들 정리해보기
// 기타복습
