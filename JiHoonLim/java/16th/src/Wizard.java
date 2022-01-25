public class Wizard extends Adventurer{

    //마법사
    public Wizard(){
        super();

        //주스텟
        iqUpdate(MAJOR);
        menUpdate(MAJOR);

        //부스텟
        strUpdate(MINOR);
        conUpdate(MINOR);
        lukUpdate(MINOR);
        dexUpdate(MINOR);

    }

    // 여기서 부터 마법사 스킬
    public int calcLightningDmg(){
        return (int) (getmAtk() * getIq() * 2.5);
    }
    @Override
    public void qSkill() {
        //super.qSkill();  --> 스킬 계승 X
        System.out.printf("%10d - 라이트닝 볼텍스\n", calcLightningDmg());
    }

    public int calcIceCallDmg(){
        return (int) (getmAtk() * getIq() * 2);
    }
    @Override
    public void wSkill() {
        System.out.printf("%10d - 혹한의 부름(광범위, 범위 슬로우)\n", calcIceCallDmg());
    }
}
