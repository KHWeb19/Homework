public class DiceGame {
    public static void main(String[] args) {

        Player game = new Player(2, 2);

        //강사님걸 한번보고 혼자서 코드를 짜보려하니깐
        //일단 기본적으로 어떤 것을 클래스화 하고
        // 클래스화 한것에 어떤 기능을 담아야 좋을지가 아직 어렵다
        //와꾸를 잡아보는데도 잘 되지 않는다.
        //많은 연습이 필요할것 같다



        //2명이 주사위 게임을 한다. (배열 활용)
        //주사위는 각자 2개씩 굴릴 수 있다.
        //처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
        //(2, 4, 6, 8, 10, 12)
        //한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
        //(특수 스킬 주사위는 1번만 굴린다)
        //이 특수 스킬들은 1, 3, 4, 6에서 동작한다.
        //1번의 경우 상대방의 주사위 눈금을 2 떨군다.
        //3번의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
        //4번의 경우 그냥 패배 처리한다.
        //6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
        //2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다.

        //주사위 클래스
        //플레이어 클래스
        // 플레이어 배열 생성해서 각각 주사위를 돌리면 될듯
        //스킬 클래스??
    }
}