public class InterfaceProblem {
    public static void main(String[] args) throws InterruptedException {
        // 앞서 이야기 했듯이 게임을 하나 만들어봅시다.
        // qSkill, wSkill 두 개 정도를 만들고
        // 캐릭터가 많으면 힘드니까 전사, 마법사 정도로 처리하면 되겠습니다.
        // 여기서도 모험가 -> 전사 -> 2차 전직(전사)
        //         모험가 -> 법사 -> 2차 전직(법사)
        // 이와 같은 형식으로 설정도 가능할 것입니다.

        /*
        1. 턴제게임 매턴이지나갈때마다 일정 대미지를 생성한다.
        2. 게임 진행의 총괄을 담당할 GameManager 생성
        3. 직업별 class 생성
        4. RpgGame class 생성
        5. Turn class 생성
         */

        /*
        모험가
           attack(기본공격), qSkill, wSkill
           attack(기본공격)은 10
           qSkill 은 15
           wSkill 은 20 의 대미지를 준다.

                  기본공격   qSkill   wSkill
           모험가    10       15        20

           매턴 플레이어는 3가지 공격중 1가지를 랜덤사용(확률동일)한다.

                   1차    2차
           모험가 - 전사 - 기사
           모험가 - 법사 - 현자

           누적 대미지가 100일때 player 는 성장하여 1차 전직을 한다.
           누적 대미지가 1000일때 player 는 성장하여 2차 전직을 한다.

           1차   기본공격   qSkill   wSkill
           전사    30       50        70
           법사    10       50        90

           2차   기본공격   qSkill   wSkill
           기사    100      150      200
           현자    10       150      290

           누적대미지가 2500을 초과할때 먼저 달성하는지로 승패를 결정한다
         */
        GameManager gm = new GameManager();

        gm.gameStart();
    }
}