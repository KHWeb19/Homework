import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        //배열로 로또 문제를 만들어보기!
        // 실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        //배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        /*
        1. 배열 생성
        2. 100명 중에 5명만 뽑을 수 있지. for문에 랜덤 값 해서, 100명 기준으로 반복 돌리기 당첨되도록 한다.
        3. 배열값에 당첨되는 자리를 배치해놓는다..  -> 임의 값으로 5명 배열 정해놓기
        4. 사용자가 돌려서 당첨되는지 판정한다. -> 스캐너 사용
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("번호를 입력해주세요(1~100)");
        int num = sc.nextInt();

        final int MAX = 100;
        final int MIN = 1;
        int range = MAX - MIN +1;
        int rand = 0;


        final int END = 100;
        int [] arr =  new int[END];

        for(int i=0;i<END;i++){ // 1~100 순서대로 일단 넣기
            arr[i] = i+1;
        }

        for(int i = 0;i<5;i++){ // 랜덤문 5개만 뽑기, 근데 뽑으면.. 값이 겹칠수도있잖아?? 교환해야할것같은데
            rand = (int)(Math.random()*range+MIN);
            arr[i] = rand;
            System.out.printf("당첨번호는 %d입니다.\n",rand);
        }
        if(rand == num){
            System.out.println("당첨입니다!");
        }else {
            System.out.println("땡");
        }


    }
}
