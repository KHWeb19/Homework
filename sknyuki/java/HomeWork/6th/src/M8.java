public class M8 {
        public static void main(String[] args) {
            DiceClass dice = new DiceClass();

            dice.initDice();
            System.out.println("주사위 굴리기: " + dice.rollDice());
        }
    }
