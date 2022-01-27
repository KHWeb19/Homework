public class HW10 {
    public static void main(String[] args) {


/*1 ~ 100까지의 숫자를 순회한다.

     9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.

     다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고

     이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!*/

        final int START=1;
        final int END=100;
        final int MIN=2;
        final int MAX=10;



        int range = MAX-MIN+1;
        int decision;
        int i;
        int sum=0;



        for (i=START;i<=END;i+=decision){

             decision = (int) ((Math.random() * range) + MIN);//for문 밖에 있으면 한번 할당된 변수를 가지고 계속 더함
                                                              //for문 안에 있으면 계속 할당된 변수가 바뀌어져서 더해짐
            System.out.printf("뽑은 난수 :%d, 현재 이동한 위치 : %d\n",decision,i);

            sum+=i;
         }
        System.out.printf("현재까지의 이동위치의 합: %d",sum);
        }






    }






