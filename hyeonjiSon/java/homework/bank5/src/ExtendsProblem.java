public class ExtendsProblem {
    public static void main(String[] args) {

        DiceGame dg = new DiceGame(); // DiceGame 데이터 타입의 dg 객체 생성

        dg.startGame();// dg 내부에 있는 startGame() 매서드를 실행하세요.
        System.out.println(dg); //dg의 내용을 출력하세요.

        dg.printResult(); // dg 내부에 있는 printResult() 매서드를 실행하세요.
                     // 특수 주사위 4가 나온 경우 바로 패배로 판정하는 매서드
                     // + 최종 승패 결과 출력
    }
}
