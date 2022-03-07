public class test {
    public static void main(String[] args) {
            int a = 7;
            int b = 8;
            int c = 10;
            boolean result1 = a < b && --c + 3 == a;
            //result1은 참이다 → a가 b보다 작고 AND c-1+3 이 a와 같을 때
                              //7이 8보다 작고 AND 9+3이 7과 같을 때 (후자 조건이 맞지 않음)
        System.out.println("int a는" + a);
        System.out.println("int c는" + c);

            System.out.println(result1);

            int d = (a < c)? a : c ; //<삼항 연산자

        System.out.println("int d의 값은 " + d);
            //"3개의 피연산자를 필요로 하는 연산자라는 뜻.
        //(조건문) ? 참일때 : 거짓일때 ; 형태를 띄고 있다.
        //세 개의 질문을 넣음으로 코드의 길이를 줄일 수 있다. 가독성을 해치지 않으면서 코드가 간결해지는 경우에 사용하면 좋다."
        //(a가 c보다 작은가?)? 라는 내용이 참이면 a, 거짓이면 c (참이니까 a인 7이 나오겠죠?)
            int e = b-- + d; // e = 8(후항 연산이므로 이번 계산에서 -1이 적용되지 않음) + 7
        System.out.println("int e의 값은 " + e);
            int result2 = (d+e); //e는 15 d는 7
            System.out.printf("결과는"+ result2 + "입니다.");
    }




    }
