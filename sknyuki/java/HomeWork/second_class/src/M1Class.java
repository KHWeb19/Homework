public class M1Class {
     /*  final int max= 122;
        final int min= 65;
        int range= (max-min)+1;
        int num=(int)(Math.random()*range+min);

        //아스키코드 소문자와 대문자 라인 => 65~90, 97~122
        boolean upperlLine= 65<=num && num<=90;
        boolean lowerLine= 97<=num && num<=122;

        if(upperlLine||lowerLine){
            System.out.println(num);
        */

    /*
    범위 지정 122
     */
    final int MAX = 122;
    final int MIN = 65;
    int range = (MAX - MIN) + 1;
    int num;
    boolean upperlLine;
    boolean lowerLine;
    int cnt;

    public boolean inputNum() {
        cnt++;
        System.out.printf("%d번째 루프입니다\n",cnt);

        boolean chr = true;
        //while문을 돌리기 위해 boolean값을 부여

            num = (int) (Math.random() * range + MIN);
            //while 값 내부에 decision값을 부여하는것으로 매 루틴 마다 새로운 값을 부여함
            upperlLine = 65 <= num && num <= 90;
            lowerLine = 97 <= num && num <= 122;
            //아스키코드 소문자와 대문자 라인 => 65~90, 97~122
            if (upperlLine || lowerLine) {
            }else{
                System.out.println("루프가 종료됩니다.");
                chr = false;
                return chr;}


        return chr;

    }

    public void printNum() {
        while (inputNum()) {

                System.out.printf("범위 내의 숫자는 %c(%d)이다\n", num, num);
                //false로 변환 시켜 루프를 종결 (true인 채면 무한 반복이 되어버림)
            }
        }
    }