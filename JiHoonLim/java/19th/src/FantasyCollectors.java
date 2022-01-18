public class FantasyCollectors {
    public static void main(String[] args) throws InterruptedException {

        RolePlayingGame rpg = new RolePlayingGame();

        /*
        레이드 인원 3명제한
        캐릭터 5개 구현
        전사 , 법사 , 헌터, 암살 , 힐러


        레이드 보스 설정 - hp , p(m)Def, luk, men, coon
        luk - 회피
        men , mdef - 마뎀감소
        con , pdef - 물뎀감소
        레이드 클리어 판정
         */

        rpg.huntStart();
        rpg.bossRaid();
    }
}
