public class Warrior extends Adventurer{
    final float WARRIOR_BONUS = 100;

    // 전사
    public Warrior(){
        super();

        warriorPromotionBonus();
    }

    public void warriorPromotionBonus(){
        pAtk += WARRIOR_BONUS;

        // 주스텟
        str += MAJOR;
        con += MAJOR;

        //부스텟
        luk += MINOR;
        dex += MINOR;
        iq += MINOR;
        men += MINOR;
    }


    /*
    // 여기서부터 워리어 스킬
    public int calcBurstCannonDmg(Fenryl target){
        return (int) (5 * (pAtk * str * 0.7 + dex *  0.1));
    }


    @Override
    public void qSkill(Object obj) {
        //super.qSkill();  --> 스킬 계승 X
        System.out.printf("%10d - 버스트 캐논\n", calcBurstCannonDmg((Fenryl) obj));
    }

    public int calcChargeDmg(Fenryl target){
        return (int) (pAtk * str * 0.5 + mAtk *  0.3);
    }

    @Override
    public void wSkill(Object obj) {
        System.out.printf("%10d - 돌격(스턴 2초)\n", calcChargeDmg((Fenryl) obj));
    }

     */
}
