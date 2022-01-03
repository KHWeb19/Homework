public class HW1_2 {
    public static void main(String[] args) {

      //break 사용한 예제

        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;

       //설정할 필요가 없음 boolean eng = true;



        while (true)//true면 while에 들어감
        {
            int rand = (int) ((Math.random() * range) + MIN);

            boolean condition1 = (rand >= 65) && (rand <= 90);
            boolean condition2 = (rand >= 97) && (rand <= 122);

            if (condition1 || condition2) {

                System.out.printf("%c는 문자 입니다.", rand);
               //설정필요 x  eng = false;
                break;

            }
           // else {
           //     System.out.printf("%c는 문자가 아닙니다.", rand);}
            //while(true)로 바꼈을 때는 무한루프가 생성되는데 이때 값을 빼주기 위해서 break 사용
            //while(boolean)을 설정해주면 if 절 안에 eng=false; 을 적어주고 else를 사용한다
        }
    }
}
