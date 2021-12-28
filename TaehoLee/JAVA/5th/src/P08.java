public class P08 {
   /*
   2명이 주사위 게임을 한다. (배열 활용)
   주사위는 각자 2개씩 굴릴 수 있다.
   처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
            (2, 4, 6, 8, 10, 12)
   한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
            (특수 스킬 주사위는 1번만 굴린다)
   이 특수 스킬들은 1, 3, 4, 6에서 동작한다.
            1번의 경우 상대방의 주사위 눈금을 2 떨군다.
   3번의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
            4번의 경우 그냥 패배 처리한다.
   6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
            2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다.
     */
   public static void main(String[] args) {

      //// 돌아가게만 만들었는데 최적화가 전혀 안되어있어서 정답이 필요합니다.


      final int MAX = 6;
      final int MIN = 1;
      final int NUM = 2; // 플레이어 수
      final int DICE = 2; // 주사위 굴릴 수 있는 수
      int range = MAX - MIN + 1;

      int[] arr = new int[NUM];

      for(int i = 0; i < NUM; i++){
         int rand = (int)(Math.random() * range) + MIN; // 주사위 값
         arr[i] = rand; // 첫번째 주사위

         // 두번째 주사위
         if(arr[i] % 2 == 0){
            rand = (int)(Math.random() * range) + MIN; // 두번재 주사위 값
            if(rand == 1){
               if(i == 0){
                  arr[i + 1] -= 2;
               }
               else{
                  arr[i - 1] -= 2;
               }
            }
            else if(rand == 2 || rand == 5){
               arr[i] += rand;
            }
            else if(rand == 3){
               if(arr[0] >= 0){
                  arr[0] -= 6;
               }
               else{
                  arr[0] = 0;
               }
               if(arr[1] >= 0){
                  arr[0] -= 6;
               }
               else{
                  arr[1] = 0;
               }
            }
            else if(rand == 4){
               System.out.printf("Player %d님이 패배하셨습니다.\n", (i + 1));
               arr[i] = -100;
               break;
            }
            else {
               arr[i] += 3;
               if(i == 0){
                  arr[i + 1] -= 3;
               }
               else{
                  arr[i - 1] -= 3;
               }
            }
         }
      }
      if(arr[0] > -100 && arr[1] > -100) {
         System.out.printf("Player 1 = %d\nPlayer 2 = %d\n\n", arr[0], arr[1]);
         if (arr[0] > arr[1]) {
            System.out.println("Player 1님이 승리하셨습니다.");
         } else if (arr[0] == arr[1]) {
            System.out.println("무승부입니다.");
         } else {
            System.out.println("Player 2님이 승리하셨습니다.");
         }
      }
   }
}
