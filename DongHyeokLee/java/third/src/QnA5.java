public class QnA5 {
    public static void main(String[] args) {

        //논리 연산자 베이스로 풀이
        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;

        int rand = (int) (Math.random() * range + MIN);

        //알파벳이 26개이기 때문
        //65~ 90 범주가 대문자
        //97~ 122범주고 소문자

        //  여기서 우변은 참이란 뜻인가? 그냥 조건식?
        boolean condition1 = rand >= 65 && rand <=90;
        boolean condition2 = rand >= 97 && rand <=122;

            // ||는 OR 연산자 : 두 개의 조건중 하나만 일치하면 진행
            // &&는 AND 연산자 : 두 개의 조건 모두 만족해야 진행
            // OR는 합집합 , AND는 교집합
            //!은 NOT 연산으로 참을 거짓으로 만들고 거짓을 참으로 만듦

        if(condition1||condition2){
            System.out.printf("rand는 영문자 대소문자중 하나임 : %c\n", rand);
        }
    }
}
