public class Atest {
    public static void main(String[] args) {
        IntFloatDouble intFloatDouble = new IntFloatDouble();
        intFloatDouble.initNum(5, 3.2f, 1.3029);

        RandInt RandInt = new RandInt();
        RandInt.initRand(1, 100);
        RandFloat randFloat = new RandFloat();
        randFloat.initRand(1, 100);
        RandDouble randDouble = new RandDouble();
        randDouble.initRand(1, 100);

        Dice dice = new Dice();
        System.out.println("두 주사위의 합: "+dice.sumDice(2));
        dice.evenDice();

        Rand rand = new Rand();
        System.out.println("랜덤 숫자를 생성해보세요. "+rand.initRand(4, 97));
        System.out.println("랜덤 숫자를 생성해보세요. "+rand.initRand(65, 90));
        System.out.println("랜덤 숫자를 생성해보세요. "+rand.initRand(97, 122));
        rand.daesoRand();
    }
}
