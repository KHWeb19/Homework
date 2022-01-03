public class M8 {
    public static void main(String[] args) {
    //2명이 주사위 게임을 한다. (배열 활용)
        //   주사위는 각자 2개씩 굴릴 수 있다.
        //   처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.(sum%2==0)
        //   (2, 4, 6, 8, 10, 12)
        //한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
        //   (특수 스킬 주사위는 1번만 굴린다)
        //   이 특수 스킬들은 1, 3, 4, 6에서 동작한다.
        //   1=>상대 -2
        //   3=>둘다 -6 (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
        //   4=> 패배
        //   6=>상대-3, 나+3
        //   else 단순히+

        //초기설정
        //player1,player2(배열)  normalDice 2(배열?)
        //주사위 눈금 범위 설정
        //(int)(Math.random()*6+1);
        //주사위 sum1값 sum2값 (sum%2==0)이면 한번더 specialDice
        //누적된 눈금값 total1, total2
        //specialDice1,specialDice2 눈금 범위 설정

        //if 주사위 sum1값 (sum%2==0)이면 specialDice(수식 어떻게?)

        //specialDice1 주사위 설정
        //if (specialDice1==1)->player2 tolal2 -2
        //else if(specialDice1==3)->total1,2-6
        //else if(specialDice1==4)->boolean lose=break;
        //else if(specialDice1==4)->total2-3,total1+3
        //else->total1+

        //specialDice2 주사위 동일하게 설정





    }
}
