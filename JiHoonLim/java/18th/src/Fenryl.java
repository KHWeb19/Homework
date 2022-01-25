import java.util.ArrayList;

public class Fenryl {

    // 기본 스텟 선언
    protected float pAtk , mAtk;
    protected float pDef , mDef;
    protected float hp , mp;
    protected float str , dex , luk, iq , con, men;

    // 기본 스텟 변수 초기화
    final float PATK = 50;
    final float MATK = 50;
    final float HP = 1000000000;
    final float MP = 100;
    final float PDEF = 1150;
    final float MDEF = 1150;
    final int STR = 10;
    final int DEX = 10;
    final int IQ = 10;
    final int LUK = 1000;
    final int MEN = 900;
    final int CON = 900;

    // rpg 와 fen 에 들어가있음
    // 공통 객체 관리가 필요( 리팩토리는 내일)
    final int WARROAD = 1;
    final int SORCERESS = 2;
    final int HUNTER = 3;
    final int ASSASSIN = 4;
    final int SUPPORTER = 5;

    public Fenryl(){
        pAtk = PATK;
        mAtk = MATK;
        str = STR;
        dex = DEX;
        iq = IQ;
        mp = MP;

        //우선 구현 할 스텟들
        hp = HP;
        pDef = PDEF;
        mDef = MDEF;
        luk =LUK;
        men = MEN;
        con = CON;
    }

    //보스몹의 생사 여부 판정
    public boolean isDead(){
        if(hp <= 0){
            return true;
        }else {
            return false;
        }
    }


    public void raidTurnStart(ArrayList<Object> member, ArrayList<Integer> check){

        // 3명의 전투캐릭터 정보를 받아와서 보스 hp - 직업q스킬
        for (int i = 0 ; i < 3; i++){
            switch (check.get(i)){
                case WARROAD:
                    hp -= ((Warroad)member.get(i)).qSkill(this);
                    break;
                case SORCERESS:
                    hp -= ((Sorceress)member.get(i)).qSkill(this);
                    break;
                case HUNTER:
                    hp -= ((Hunter)member.get(i)).qSkill(this);
                    break;
                case ASSASSIN:
                    hp -= ((Assassin)member.get(i)).qSkill(this);
                    break;
                case SUPPORTER:
                    hp -= ((Supporter)member.get(i)).qSkill(this);
                    break;
            }
        }
    }
}
