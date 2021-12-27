public class HW9_1 {
    public static void main(String[] args) {


        //100까지 순회...for
        // 랜덤 숫자 생성 ...Math
        // 배수출력....if 로 배수
        //다음 루프 ...if나 while로

        final int START= 1;
        final int END = 100;
        final int MAX = 10;
        final int MIN =2;
        final int REMAIN=0;

        int i;
        int decision;
        int range=MAX-MIN+1;

        boolean check=false;
        for(i=START;i<=END;i++){
            decision=(int)((Math.random()*range)+MIN);

            while (!check){
                decision=(int)((Math.random()*range)+MIN);
               check=true;}


            if(i%decision==REMAIN){
                System.out.printf("%d의 배수:%d\n",decision,i);
                check=false;
            }




        }



    }
}
