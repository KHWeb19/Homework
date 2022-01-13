public class InterfaceProblem {
    public static void main(String[] args) throws InterruptedException {

        /*
        System.out.println("모험가 공격");
        Adventurer ad = new Adventurer();
        ad.attack();
        ad.wSkill();
        ad.qSkill();

        System.out.println();
        System.out.println("법사 공격");
        // 갑자기 헷갈린다...
        // 법사는 한명인데 왜 클래스를 만들었을까..?
        // 아 게임에서는 법사가 한명인가
        // 전사랑 법사랑 둘중에 선택해서 하는거니깐 법사가 많아 질 수 있기때문
        // a 법사, b 법사, c 법사 ....
        Magician mg = new Magician();
        mg.attack();
        mg.wSkill();
        mg.qSkill();

        System.out.println();
        System.out.println("전사 공격"); // 전사가 기사보다 더 쎄보이는 이름인데.. ㅎ

        Warrior wa = new Warrior();
        wa.attack();
        wa.qSkill();
        wa.wSkill(); // 스킬이 평타보다 약해도 되는건가..?


        System.out.println();
        System.out.println("기사");
        Knight kn = new Knight();
        kn.attack();
        kn.wSkill();
        kn.qSkill();

        System.out.println();
        System.out.println("위자드");
        Wizard wz = new Wizard();
        wz.attack();
        wz.wSkill();
        wz.qSkill();

         */

        RolePlayingGame rpg = new RolePlayingGame();
        rpg.gameStart();
    }
}
