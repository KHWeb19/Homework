import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
/* 3. 배열로 로또 문제를 만들어보기!
      실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
      실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
      배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.
*/
        final int START = 1;
        final int END = 5;  // 난수발생 5회 , 발생된 난수값이 배열의 인덱스값

        final int MAX = 100;
        final int MIN = 1;
        int range = MAX - MIN +1;  // 1 ~ 100 사이의 난수를 발생
        boolean condition = false; // 당첨인지 아닌지
        Scanner scan = new Scanner(System.in);

        int randIdx;
        int randIdxArr[] = new int[5]; //발생된 5개의 난수가 입력될 배열
        int i = 0;

        while(i < 5){
            randIdx = (int)(Math.random()*range+MIN);
            randIdxArr[i] = randIdx;// 랜덤인덱스 배열의 0항부터 4항까지 난수로 결정된 랜덤인덱스를 순차적으로 기입
            i++;
        }

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
        System.out.println("당첨된 숫자 ");
        for(i=0;i<5;i++){
            System.out.printf(""+randIdxArr[i]+"/");
        }

        System.out.println();
        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
        int cnt = 0;
        int wincnt = 5;
        while(cnt<100){
            System.out.println("======================================");
            System.out.printf("!) 남은 당첨 횟수 = %d\n",wincnt);
            System.out.println("--------------------------------------");
            System.out.printf("%d번째 선택\n",cnt+1);
            System.out.print("1~100까지의 숫자 중 하나를 선택하세요 : ");
            int inputNum = scan.nextInt();
            for(i=0;i<5;i++)
            {
                if(inputNum==randIdxArr[i]){
                    randIdxArr[i] = 0;  // 숫자를 맞추면 해당 숫자는 사라짐
                    condition = true;
                }
            }
            if(condition){
                System.out.println("당첨입니다!");
                System.out.println("======================================");
                wincnt--;
            }
            else{
                System.out.println("아쉽지만 다음 기회에...");
                System.out.println("======================================");
            }
            if(wincnt<=0){
                System.out.println("당첨 숫자가 모두 소진되어 종료합니다");
                break;
            }
            else{
                cnt++;
                inputNum = 0;
                condition = false;
            }
        }

    }
}
