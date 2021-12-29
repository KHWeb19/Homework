public class HW9 {
    public static void main(String[] args) {
        /*   1 ~ 100까지의 숫자를 순회한다.
    2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
    다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
    그 다음 루프에서 다시 작업을 반복한다.
    끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ?*/


        //1.100까지.........for문
        //2.10까지 랜덤생성....랜덤
        //3.배수 출력> for문 속의 if문으로 사용하자
        //4.다시 루프를 돌린다....>다시 루프를 돌리기 위해서 while 사용
        //5.while을 사용한다면 boolean을 정의해줘야함.
        //boolean은 무엇을 정의해야 하나..
        //하나의 난수를 정하고 거기에 i의 값이 돌때 i가 배수가 되는지
        //이때 랜던값은 하나의 배수가 생성되기 전까지는 생성될수 없음.

        final int START=1;
        final int END=100;
        final int MIN=2;
        final int MAX=10;
        final int REMAIN=0;


        int sum=0;
        int range = MAX-MIN+1;

        int decision =0;
        boolean check = false;
        //난수의 배수 생성 확인
        //i가 난수의 배수인가?라는 의미

        for (int i=START;i<=END;i++){
            //1~100까지 돌아가는 동안


            while(!check)
            //참인상태에서 decision은 할당이 되어있는 상태
            //(!check)가 false면 while이 작동하지 않음
              {
                  decision = (int) ((Math.random() * range) + MIN);//한번만 들어가야함
                  check = true;
             }

            /*
            if (!check){
                decision = (int) ((Math.random() * range) + MIN);
                check = true;
            }
            */

           //if문 이라면 도는 거고 아니면 생략한다
            if (i % decision == REMAIN) {
                System.out.printf("%d의 배수: %d\n",decision,i);
                check = false;
                  }

             sum+=i;
        }


        System.out.printf("합계 :%d",sum);



    }
}
