import org.openjsse.util.RSAKeyUtil;

public class Warrior extends Adventurer{

    public Warrior(){
        super();

        // 주 스탯은  힘
        StrUpdate(MAJOR);
        ConUpdate(MAJOR);
        DexUpdate(MINOR);
        AgiUpdate(MINOR);
        IqUpdate(MINOR);
        MenUpdate(MINOR);
    }

    public int calcSevenSlashDamage(){
        return (int)(7 * (getpAtk() * getStr() * 0.7 + getDex() * 0.1));
    }

    public int calcSwordSharpenDamage(){
        return (int)((getpAtk() * getStr() * 0.5 + getmAtk() * 0.3));
    }

    @Override
    public void qSkill() {
        // 자동 완성 기능을 사용하면 super()을 부르고 있음
        // 보통 게임을 하게 되면 전직 했어도 이전 클래스의 기술을 사용할 수있음.
        // super를 통해 이전 클래스의 스킬을 계승할 수 있음.
        // super를 안쓰고 새로운 스킬로 덮어쓰는것임.

        // 계승을 못하도록 한것임.
        //super.qSkill();
        System.out.printf("%10d - 7연참\n",calcSevenSlashDamage());
    }

    @Override
    public void wSkill() {
        //super.wSkill();
        //제어기가 뭐지..?
        System.out.printf("%10d - 칼등치기: 스턴 2초\n",calcSwordSharpenDamage());
    }
}
