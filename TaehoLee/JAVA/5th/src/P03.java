import java.util.Scanner;

public class P03 {
       /* 3. 배열로 로또 문제를 만들어보기!
    실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
    실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
    배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.
     */
       public static void main(String[] args) {

              final int MIN = 0;
              final int MAX = 100;
              final int DECISION = 5;

              int range = MAX - MIN + 1;
              int sum = 0;
              boolean isWin = false;

              int arr[] = new int[MAX];

              for(int i = MIN; i < MAX; i++){ // 초기값 입력
                     arr[i] = 0;
              }
              Scanner scan = new Scanner(System.in);
              System.out.print("당첨번호는? (1 ~ 100사이를 입력해주세요) : ");
              int win = scan.nextInt();

              while(!isWin){

                     int rand = (int)(Math.random() * range) + MIN; // 랜덤값 찾기
                     arr[rand] = 1; // 랜덤 자리 찾기

                     for (int i = MIN; i < MAX; i++) {
                            sum += arr[i]; // 중복값 확인
                     }
                     System.out.println("당첨번호는 : " + (rand + 1)); // 출력

                     if (sum >= DECISION) { // 종료 구문
                            isWin = true;
                     }
                     else{
                            sum = 0; // sum 값 초기화
                     }
              }
              if(arr[win - 1] == 1){ // 당첨 확인
                     System.out.println("당첨되셨습니다!");
              }
              else{
                     System.out.println("미당첨 되셨습니다.");
              }


       }
}
