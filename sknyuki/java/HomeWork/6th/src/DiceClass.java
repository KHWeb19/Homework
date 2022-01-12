public class DiceClass {
        static final int MAX = 6;
        static final int MIN = 1;

        int range;

        public void initDice () {
            range = MAX - MIN + 1;
        }

        public int rollDice () {
            return (int) (Math.random() * range + MIN);
        }

    }
