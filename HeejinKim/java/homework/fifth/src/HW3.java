import java.util.Scanner;

public class HW3 {
    //배열로 로또 문제를 만들어보기
    //100명 중 5명을 뽑아보도록 하자
    //배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다

    public static void main(String[] args) {
        //1.100개의 배열생성
        //2.11,22,33,66,77자리가 당첨자리라고 만들기
        //3.사용자가 돌려서 ....라는 뜻이 뭐지>>>랜덤을 사용하라는 뜻인가?...사용자가 입력하라는 뜻??
        //4.100명중 5명을 뽑자....라는 뜻은 뭐지...
        //   4-1 당첨 숫자의 자리를 정해놓고 ..아 무슨뜻이지??????
        // 로또 숫자와는 상관없이 당첨되는 자리배열을 만들어 놓고 만약 11번째가 당첨자리라고 하면 10을 입력했을때 꽝으로 나오게끔하라는 말인가
        final int MAX = 100;
        int []arr = new int [MAX];

        //boolean[] arr = new boolean[MAX]; boolean으로 적어도 가능

        Scanner scan = new Scanner(System.in);
        System.out.print("몇번째 사람입니까?");

        int put = scan.nextInt();


        for (int i = 1; i < MAX; i++) {

            if (i == 11 || i == 22 || i == 33 || i == 66 || i == 77) { //당첨자리 생성

                arr[i] =1;
                //arr[i] =true; boolean을 썼을 경우에

            } else {

                arr[i]= 0;
               // arr[i]= false;
            }
        }

        if (arr[put] == 1) {//100까지 다 돈다음에 입력한 값과 자리를 매칭하여 당첨 결과를 확인
            System.out.println("당첨");
        } else {
            System.out.println("꽝");


        }

    }
}
