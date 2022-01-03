import java.util.Scanner;

public class Homework_08 {
    public static void main(String[] args) {
        //8. 2명이서 하는 주사위 게임. (배열 사용)
        // 첫번째 주사위가 짝수가 나오면 2번째도 굴림. / 아닐 경우 첫번째 주사위 만큼 가는건가...?
        // 아님 첫번째 주사위가 짝수가 나오면 3번째도 굴릴 수 있는건가..?

        // 첫번째 주사위가 짝수 나올경우 2번째를 굴릴 수 있다고 하자.
        // 2번째의 수에 따라
        // 1 -> 상대방 -1 / 3 -> 다 같이 -3(최저 점수는 0으로 지정)/ 4 -> 굴린 사람이 패배
        // 6 -> 상대방 -3, 굴린 사람 +3 / 2,5 -> 나온 숫자만큼 +2, +5

        // 배열을 사용하라는건.. 주사위를 사용하라는건가?
        // 아님, 값을 넣을때 사용하라는건가..?
        // 값을 넣는건 다 더한 숫자이기 때문에 배열을 사용할 필요가 없다고 생각함.
        // 그럼 주사위를... 배열로..? -> 주사위도 랜덤으로 나오는 값 아닌가...?

        // 각 점수를 배열에 넣고 합산하자.

        final int USER = 2;

        int[] score = new int[USER];

        final int MAX = 6;
        final int MIN = 1;
        final int RANGE = MAX - MIN +1;

        final int NUMBER = 2;
        final int REMINE = 0;
        int i;

        int dice1;
        int dice2;

        boolean isCheck = true;

        while(isCheck){ // 2번째 주사위가 4가 나와 누가 패배하기 전까지 계속. -> 이렇게 할 경우 for문을 다 하고 빠져나와야하기 때문에
                           // 바로 멈추지 못한다... if 문으로 break로 해주는게 좋겠다.
            dice1 = (int)(Math.random()*RANGE +MIN);

            // i =0, i =1 이 계속 반복해서 나와야함..
            // USER -1 까지 계속 반복해야함..

            for(i = 0; i < USER; i++){
               score[i]+= dice1;
                System.out.printf("%d의 첫번째 주사위 값 %d\n>>합산 결과%d\n",i+1,dice1,score[i]);

               if(dice1 % NUMBER == REMINE){ // 2번째 주사위가 짝수가 나올 경우에.
                   //dice2 = (int)(Math.random()*RANGE +MIN);

                   //scanner을 통해서 숫자를 지정해서 확인해보자
                   Scanner scanner = new Scanner(System.in);
                   System.out.printf("%d의 두번째 주사위를 입력해주세요>>",i+1);
                   dice2 = scanner.nextInt();
                   if(dice2 == 1){
                       // 상대방 점수를 어떻게 빼지..?
                       // i가 0일 경우 -> i +1;
                       // i가 1일 경우 -> i -1;

                       // 최저는 0이 되야하는데 어떻게 해야할까...
                       // 자연수만 나타낼 수 있는 데이터 타입이 있을까..
                       // 없으면.. if 문 안에 if 문을 따로 만들어야 할까요...?
                       if(i == 0){
                           score[i+1] -= 1;
                       }else
                           score[i-1] -= 1;
                   }else if(dice2 == 3){
                       score[i] -=3;
                       if(i == 0){
                           score[i+1] -= 3;
                       }else
                           score[i-1] -= 3;

                   }else if(dice2 == 6){
                       score[i] +=3;
                       if(i == 0){
                           score[i+1] -= 3;
                       }else
                           score[i-1] -= 3;

                   }else if(dice2 == 2 || dice2 == 5){ // dice2 == 4인 경우가 있어서 else 사용 못함.
                       score[i] += dice2;
                   }else {
                       isCheck = false;
                       break;
                   }

                   if(score[i]<0){ // 0보다 작을경우.
                       score[i] = 0;
                   }

                   if(i == 0){
                       if (score[i+1] < 0){
                           score[i+1] = 0;
                       }
                   }else{
                       if (score[i-1] <0){
                           score[i-1] = 0;
                       }
                   }

                   System.out.printf("%d의 점수: %d\n",i+1,score[i]);

               }
            }

            if(i == USER){
                i =0; //i를 0으로 만들어 다시 for문으로 이동할 수 있도록
            }
        }

    }
}
