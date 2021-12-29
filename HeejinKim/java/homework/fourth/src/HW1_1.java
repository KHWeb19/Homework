public class HW1_1 {

    public static void main(String[] args) {
        /*65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
         여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자*/

        //1.랜덤한 수 생성.....range + Math.random
        //2.소문자 대문자 가 아니라면 이라는 if문.....boolean 설정해서 깔끕하게
        //3.다시 돌아가는 가라----while
        //4.if절에 맞는 수가 나오면 boolean을 설정해서 while(false)로 만들어주어서 끝나게 되어 출력
        //4.final을 써서 사용


        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;

        //int rand=(int)((Math.random()*range)+MIN);
        boolean eng = true;



        while (eng)//true면 while에 들어감
        {
            int rand = (int) ((Math.random() * range) + MIN);//while문 안에 들어와야 계속 생성가능

            boolean condition1 = (rand >= 65) && (rand <= 90);
            boolean condition2 = (rand >= 97) && (rand <= 122);

            if (condition1 || condition2) {
                //()안에 넣기엔 너무 지저분해져서 boolean을 설정해서 넣어줌

                System.out.printf("%c는 문자 입니다.", rand);
                eng = false;
                //전략4번처럼 false를 만들어줘서 더이상 while을 돌지 않음
            }


            else {
                System.out.printf("%c는 문자가 아닙니다.", rand);}
             //break만 넣으면 true로 되고// eng-false를 사용한다면 else를 한다
        }
    }
}
