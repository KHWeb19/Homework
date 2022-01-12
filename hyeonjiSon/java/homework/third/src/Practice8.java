public class Practice8 {
    public static void main(String[] args) {
        //문제8. 1 ~ 100까지 숫자를 순회한다
             // 이 부분 조건이 있는 무한루프 만들라는 게 아니라 1~100 한바퀴 나오게 하라는 말씀이 맞죠??
        //2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.

        int i = 0;
        int random = (int)(Math.random() *9 + 2);

        System.out.println("random 의 값은 = " + random);

        for(i =1; i<=100; i++){
            if(i % random == 0){ // i를 random난수의 숫자로 나누면 남는 값이 0이 된다면
                System.out.printf("1~100 사이에서 %d의 배수 : %d\n", random, i); //이 내용을 출력
                                       //앞의 %d는 random의 수 대입, 뒤의 %d는 i의 수를 대입

            }
        }

    }
}
