public class InterfaceProblem {
    public static void main(String[] args) throws InterruptedException {
        // 앞서 이야기 했듯이 게임을 하나 만들어봅시다.
        // qSkill, wSkill 두 개 정도를 만들고
        // 캐릭터가 많으면 힘드니까 전사, 마법사 정도로 처리하면 되겠습니다.
        // 여기서도 모험가 -> 전사 -> 2차 전직(전사)
        //         모험가 -> 법사 -> 2차 전직(법사)
        // 이와 같은 형식으로 설정도 가능할 것입니다.

        /*
        강사님 전략
        1. 모험가 클래스 생성
        2. 전사 , 법사 클래스 생성
        3. 전사 전직 버서커 클래스 생성
        4. 법사 전직 소서리스 클래스 생성

        5. 기본 스텟 (phy atk, mag atk, hp, mp, phy def, mag def
                    ,str(힘), dex(재주), luk(민첩), iq(지능) , men(정신) , cont(체력)
                    , exp(경험치) , lv(레벨)
        6. 1차 전직 - > 주력스텟 , 부스텟 -> 1000 부여
                        나머지 스텟은 500 부여
        7. 전사 ( 힘, 체력) , 법사(지능, 정신)
        8. 2차 전직 - > 전사(분노 게이지) , 법사(부스트 게이지)
                분노 게이지 - > 때리거나 맞을때 참
                텔레 게이지 - > 턴당 1씩 찬다
                분노 게이지 스킬
                부스트 게이지 - 데미지 증가
        9. 턴제 게임 구현 - 무한 루프 ( 몬스터 등장 -  배틀 )
        10. 경험치, 레벨 필요
        11. 몬스터 정보

        초기 캐릭터 생성 같은 부분 생략
         */

        Adventurer adv = new Adventurer();

        /*
        //test
        adv.Attack();
        adv.qSkill();
        adv.wSkill();

        //test code 전사
        Warrior war = new Warrior();

        war.Attack();
        war.qSkill();
        war.wSkill();

        //test code 법사
        Wizard wiz = new Wizard();

        wiz.Attack();
        wiz.qSkill();
        wiz.wSkill();

        //test code 워로드
        Warroad warroad = new Warroad();

        warroad.Attack();
        warroad.qSkill();
        warroad.wSkill();

        //test code 소서리스
        Sorceress sor = new Sorceress();

        sor.Attack();
        sor.qSkill();
        sor.wSkill();
        */


        RolePlayingGame rpg = new RolePlayingGame();

        rpg.gameStart();
    }
}
