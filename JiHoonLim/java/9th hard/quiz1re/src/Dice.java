public class Dice {
    final int MAX = 6;
    final int MIN = 1;

    final int EVEN = 0;

    int range;
    int dicecnt;

    int [] dice ;

    int i, sum;

    public Dice(int dicecnt) {
        this.dicecnt = dicecnt;
        dice = new int[dicecnt];

        range = MAX - MIN + 1 ;
        sum = 0;

        DiceRoll();
    }

    public void DiceRoll() {
        for ( i = 0; i < dicecnt; i ++) {
            dice[i] = (int)( Math.random() * range + MIN);
            DiceEvenODD();
            DiceSum();
        }
        System.out.printf("두 주사위의 합은 %d\n", sum);
    }

    public void DiceEvenODD() {
        if (dice[i] % 2 == EVEN){
            System.out.println("당첨");
        } else {
            System.out.println("손모가지 내놔");
        }
    }

    public void DiceSum() {
        sum += dice[i];
    }
}
