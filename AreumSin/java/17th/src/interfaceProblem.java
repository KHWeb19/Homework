public class interfaceProblem {
    // 1. Adventurer(모험가) 클래스 생성
    // 2. Warrior(전사) 클래스 생성
    // 3. Magician(법사) 클래스 생성
    // 4. Knight(기사) 클래스 생성
    // 5. Wizard(위자드) 클래스 생성

    // 6. 기본 스탯( phy atk, mag atk, hp, mp, phy def, mag def //atk - 공격
    //             str - 완력, con(vit) - 체력, dex - 재주, agi - 민첩, iq - 지능, men - 정신
    //    6-2. 경험치 바와 레벨 정보 추가

    // 7. 1차 전직에서는 주력 스탯과 부스탯탯에 +000을 주도록한다.
    //    나머지 스탯은 + 500을 주도록 한다.
    //    전사(완력, 체력), 법사(지능, 정신)

    // 8. 2차 전직에서는 새로운 기능을 열어주도록 한다.
    //    전사계 (분노 게이지), 법사계(부스터 게이지)
    //    분노 게이지: 맞거나 때리면 차오른다.
    //    부스트 게이지: 턴당 1씩 차오른다.
    //    분노 게이지를 활용해서 시전할 수 있는 스킬이 있다.
    //    부스터 게이지는 데미지를 증폭시켜준다 (몇배 증폭??)
    // 9. 턴을 구현했으므로 게임을 시작하면 무한 루프를 돌면서 몬스터가 등장하고
    //    캐릭터들은 몬스터들을 때려야한다.

    // 10. 경험치 시스템과 레벨업 시스템이 필요하다.
    // 11. 몬스터 정보(이걸 또 다 만드려면 너무 많으니 그냥 몬스터만 쏟아지도록)

    // 초기 캐릭터 생성이나 이런부분까지는 생략하도록 한다.

    public static void main(String[] args) throws InterruptedException {

        /*
        테스트 코드는 완료.

        // 초기 캐릭터 생성이나 이런 부분까지는 생략하도록 한다.
        Adventurer adv = new Adventurer();

        // test code (모험가)
        adv.attack();
        adv.qSkill();
        adv.wSkill();

        System.out.println();
        // test code (전사)
        Warrior war = new Warrior();

        war.attack();
        war.qSkill();
        war.wSkill();

        System.out.println();
        // test code (법사)
        Magician mag = new Magician();
        mag.attack();
        mag.qSkill();
        mag.wSkill();

        System.out.println();
        // test code (기사)
        Knight kni = new Knight();
        kni.attack();
        kni.qSkill();
        kni.wSkill();

        System.out.println();
        // test code (위자드)
        Wizard wiz = new Wizard();
        wiz.attack();
        wiz.qSkill();
        wiz.wSkill();

         */

        RolePlayingGame rpg = new RolePlayingGame();

        rpg.GameStart();

    }
}
