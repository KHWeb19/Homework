public class Snaiper extends Adventurer{

    final int SNIPER_BONUS = 500;            //레벨업
    final float SNIPER_MAJOR_COEF = 3.1f;    //계수로 사용
    final float SNIPER_MINOR_COEF = 1.5f;

    public Snaiper(){
        super();
        sniperPromotionBonus();

    }

   public void sniperPromotionBonus(){  //레벨업 스탯 계수
        pAtk += (SNIPER_BONUS * SNIPER_MAJOR_COEF);

        str += (MINOR * SNIPER_MINOR_COEF);
        con += (MINOR * SNIPER_MINOR_COEF);
        dex += (MAJOR * SNIPER_MAJOR_COEF);
        agi += (MAJOR * SNIPER_MAJOR_COEF);
        iq += MINOR;
        men += MINOR;
   }

   public int calcBurstShotDamage (Object target ) {      //펜릴 자체를 오브젝트로 만들자자
       return (int) (5 * (pAtk - target.pDef) *
                ( (dex - target.con) * 1.5 + (agi - target.con) * 1.2) );
   }

   //스킬은 하나만


    @Override
    public void qSkill() {


    }
}

