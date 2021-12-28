import java.util.Scanner;

public class M3 {
    public static void main(String[] args) {
        //배열로 로또 문제를 만들어보기!
        //   실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //   실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        // 100명중 랜덤으로 5개만 당첨되도록 프로그램형성?
        Scanner scan= new Scanner(System.in);

        final int ARRMAX = 100;
        final int MAX = 5;
        final int MIN = 0;
        //100명 ARRYMAX중 5명 당첨(MAX)값을 0을(MIN)값으로 적용
        int range = MAX-MIN+1;
        //당첨 번호의 갯수 범위 설정


        int[] arr=new int[ARRMAX];
        //당첨자값을 배열로 랜덤 5개 배치
        System.out.println("1부터 100까지중 당신의 번호를 입력하세요:");
        int num= scan.nextInt();
        //당신의 번호는?
        //랜덤으로 5번호를 출력
        //이에 해당되는 번호는 당첨판정
        //당첨자 번호의 중복 배제를 위해 while문 사용


        boolean ischar=true;
        int winner = 0;
        for(int i=0; i<=MAX; i++){
            while(ischar){
                winner=(int)(Math.random()*ARRMAX);
                arr[winner] = (int) (Math.random() * range + MIN);
                ischar=false;
                //if winner(i)!=winner(i-1) ?
                //ischar=false;?
            }
            if (winner==num){
                System.out.printf("축하합니다 당첨입니다. %d등입니다",arr[winner]);
                ischar=true;
                //질문
                //허나 이 방법은 100개중 당첨 번호 1개를 찾는 과정을 5번 반복하게 됨.
                //중복되지 않는 당첨 번호 5개는 어떻게 찾나요?
            }else{
                System.out.println("다음기회에");
            }
        }
        System.out.printf("당첨번호:%d,순위:%d",winner,arr[winner]);

    }
}