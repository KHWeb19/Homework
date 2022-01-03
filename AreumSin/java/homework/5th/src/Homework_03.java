import java.util.Scanner;

public class Homework_03 {
    public static void main(String[] args) {
        //3. 배열로 로또 문제를 만들어보기!
        //   실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //   실제값을 사용하기엔 검토 작업이 너무 고통스러우므로
        //   100명 중 5명을 뽑아보도록 하자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        // 로또의 시스템은...?
        // 45개의 숫자 중 여섯 개를 고르고
        // 추첨 결과와 일치하는 숫자의 개수에 따라 당첨금을 지급하는 방식이며, 숫자의 순서는 상관없다.
        // 100명중 5명의 확률을 어떻게 계산하지..?
        // 확률이 0.05%

        // 45 * 44 -> 1980 // 45개중 숫자 2개를 골라도..

        // 이렇게 해야하는건지 잘 모르겠습니다...
        // 이해를 잘못해서 9번에서 제대로 풀었습니다.


        // 숫자를 1~ 45까지 뽑아야한다.
        // 같은 수가 나오면 안됨... 같은 수가 랜덤으로 나왔을 경우 다시 랜덤.

        // 1~ 9 9개의 숫자에서 5개를 뽑아서 똑같은 수가 나올 확율이 0.008%
        // double result = (9* 8* 7* 6)/(1*2*3*4);
        // System.out.printf("지금 확률은 %.3f\n" ,1/result);

        // 1~ 6 6개의 숫자에서 3개를 뽑아서 당첨될 확률이 0.05
        double result1 = (6*5*4)/(1*2*3);
        System.out.printf("지금 확률은 %.3f\n" ,1/result1);

        // 6개의 숫자를 랜덤으로 뽑게 하자.

        final int MAX = 6;
        final int MIN = 1;
        final int RANGE = MAX - MIN +1;

        final int NUMBER = 3; // 뽑아야할 갯수

        Scanner scanner = new Scanner(System.in);

        int[] pickNum = new int[MAX];

        // 사용자가 숫자를 뽑아야함.
        for (int i =0; i < NUMBER; i++){
            System.out.printf("%d번째 숫자를 뽑아 주세요. (1~6)>>",i+1);
            pickNum[i] = scanner.nextInt();// 띄어쓰기하면 알아듣지 못한다... 이건 어떡해해야하죠...???? 키보드 버퍼를 비워라..

        }

        int[] randNum = new int[NUMBER];

        int compareNum;


        //for문을 이용해 배열에 숫자를 넣는다.
        // 여기서 똑같은 번호가 나오면 다시 랜덤을 하도록 한다.

        for(int i = 0; i < NUMBER; i++){
            // 앞에있는 배열과 뒤에 있는 배열의 숫자가 같은지 확인해야한다.
            // 2중 for문으로 하는 2에서부터 작아지게 해볼까.. xxxx 필요없음

            // 다른 변수를 생성해서 변수에 랜덤으로 생성된 수 를 넣고 그걸 먼저 비교 후 배열에 넣을까?
            compareNum = (int) (Math.random() * RANGE + MIN);


            // 변수의 갯수를 늘리지않고는 해결할 수 있는 방법은 없을까..?
            if(i != 0){
                if(randNum[i] != randNum[i-1]){
                    randNum[i] = compareNum;
                }
            }else
                randNum[i] = compareNum;

            //System.out.print(compareNum);

        }

        for (int i =0; i < NUMBER; i++){

            System.out.printf("%d번째 당첨 번호는? %d\n",i+1,randNum[i]);
            //뽑은 숫자 확인
            System.out.printf("내가 %d번째 뽑은 숫자는 %d\n",i+1,pickNum[i]);

            System.out.println();
        }


    }
}
