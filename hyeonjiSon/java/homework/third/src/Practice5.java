public class Practice5 {
    public static void main(String[] args) {
        //문제5. 1 ~ 100까지 숫자중 짝수만 출력해보자.

        for(int i = 1; i <= 100; i++){
            // 초기화: i=1이다. ; 조건: i가 100보다 작거나 같은 수가 나올 때 까지 반복 ; 줄마다 +1씩 숫자 증가

            if(i % 2 == 0){ //만약 int i의 숫자를 2로 나눈 값이 0인가? 라는 조건문을 만족하는 경우
                System.out.println("1~100까지 숫자 중 짝수 : "+ i ); //이 내용을 출력한다.
            }
        }

    }
}
