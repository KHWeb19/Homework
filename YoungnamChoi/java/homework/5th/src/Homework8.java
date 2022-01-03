public class Homework8 {
    public static void main(String[] args) {

        //2명이 주사위 게임을 한다. (배열 활용)
        //   주사위는 각자 2개씩 굴릴 수 있다.
        //   처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
        //   (2, 4, 6, 8, 10, 12)
        //   한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
        //   (특수 스킬 주사위는 1번만 굴린다)
        //   이 특수 스킬들은 1, 3, 4, 6에서 동작한다.
        //   1번의 경우 상대방의 주사위 눈금을 2 떨군다.
        //   3번의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
        //   4번의 경우 그냥 패배 처리한다.
        //   6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
        //   2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다.

        /*
        1.두명의 사람을 만들어야 한다.
        2. 각자 두개의 주사위를 가지고 있으므로 주사위도 각자 두개를 만든다.
        3.첫 번째 사람이 두개의 주사위를 돌렸을 때 합이 짝수 인지 아닌지 확인 한다.
        4.주사위의 합이 들어가는 변수 sum을 각각 선언해야 한다.
        5.합이 짝수 이면 1개의 주사위를 한 번 더 던진다.
        6.한 번 더 던진 주사위는 1,3,4,6이 나올경우 각자의 동작이 다르다.
        7.1이면 상대방의 눈금을 -2로 하고 3이면 두 사람 다 -6을 한다.
        8.4가 나올경우 그냥 게임을 끝낸다.
        9.6은 상대방에게 3을 뺏어 자신에게 3을 더해 준다.
        10.2,5과 나올 경우는 그냥 진횅한다.
         */

        //다 못 풀었습니다.

        int name1 [] = new int [2];
        int name2 [] =new int [2]; // 두면의 플레이어를 만듬

        name1[0] = (int)(Math.random()*6+1);
        name1[1] = (int)(Math.random()*6+1);

        name2[0] = (int)(Math.random()*6+1);
        name2[1] = (int)(Math.random()*6+1); //플레이어 마다 2개의 주사위를 만듬

        int sum1=0;
        int sum2=0; // 주사위의 합이 저장될 공간이다.

        System.out.println(" name1의 주사위 번호는 " +name1[0]+ ","+ name1[1]);
        sum1+=name1[0]+name1[1];

        System.out.println(" name2의 주사위 번호는 " +name2[0]+ ","+ name2[1]);
        sum1+=name2[0]+name2[1];

        boolean even = true;
        if(sum1 %2==0){
            int dice =(int)(Math.random()*6+1);
            System.out.println("새로운 넘버는 : " +dice);

            if(dice==1){
                sum2=-2;


            }else if(dice ==2){
                sum1 =+2;
            }else if(dice ==3){
                sum1= -6;
                sum2 =-6;

            }else if(dice ==5){
                sum1 = +5;

            }else if(dice ==6){
                sum2=-3;
                sum1= +sum2;
            }else if(dice ==4){
                sum1= -sum1;
                System.out.println("name1의 패배 입니다.");

            }
        }




    }
}
//