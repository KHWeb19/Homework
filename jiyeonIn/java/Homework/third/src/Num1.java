import java.lang.management.MonitorInfo;

public class Num1 {
    public static void main(String[] args) {
        //1.65~122사이의 랜덤한 문자를 생성하도록 한다.
        //여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들기

//        final int MAX = 122;
//        final int MIN = 65;
//
//        int range = MAX-MIN +1;
//        int rand = (int) (Math.random()*range+MIN);
//
//        for(int i=1;i<=122;i++){
//            if(rand >=65 && rand <=90 || rand>=97 && rand<=122){
//                System.out.printf("대문자 혹은 소문자, 출력번호 : %c, %d",rand,rand);
//                break;
//            }
//        }

        //새로 작성한 답

        final int MAX = 122;
        final int MIN = 65;
        boolean random = true;

        int range = MAX-MIN +1;


        while (random){
            int rand = (int) (Math.random()*range+MIN);

            boolean little = rand >=65 && rand <=90;
            boolean big = rand>=97 && rand<=122;

            if(little||big){
                System.out.printf("대문자 혹은 소문자, 출력번호 : %c, %d",rand,rand);
                break;
            }
            System.out.println("대문자 혹은 소문자가 아니잖아.");


        }
    }
}
