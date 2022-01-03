public class DiceClass {
    // 선생님이 풀어주신 것
    // 그런데 여기는 왜 psvm을 했는지???
    // 이전 예시들에서는 psvm 안하고 직접 메서드를 작성했는데
    // 차이점이 무엇일까
    public static void main(String[] args) {
        Dice dice = new Dice();

        dice.initDice();
        System.out.println("주사위 굴리기 : " + dice.rollDice());
    }
}
