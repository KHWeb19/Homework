public class GameTest {

    public static void main(String[] args) throws InterruptedException{

        Adventurer adv = new Adventurer();

        adv.attack();
        adv.qSkill();
        adv.wSkill();

        Magician mag = new Magician();
        mag.attack();
        mag.qSkill();
        mag.wSkill();

        Wizard wiz = new Wizard();
        wiz.attack();
        wiz.qSkill();
        wiz.wSkill();

        RollPlayingGame rpg = new RollPlayingGame();
        rpg.gameStart();

    }
}
