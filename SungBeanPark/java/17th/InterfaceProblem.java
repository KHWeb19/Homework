public class InterfaceProblem {
    public static void main(String[] args) {
        // 모험가(Advanturer) -> 전사(Warrier) -> 2차전직(Hero)
        // 모험가(Advanturer) -> 마법사(Wizard) -> 2차전직(FireWizard)
        // 모험가를 부모클래스로 잡고 자식으로 전사->2차, 마법사->2차?
        // 스킬을 모험가부터 쓰게할것인가 그이후부터 쓰게할 것인가...
        // 모험가부터 그냥 쓰는걸로... 기본공격, q,w스킬 인터페이스로 잡고

        // 다시 머릿속으로는,,,
        // 전직하려면 몬스터잡아서(어택이나 스킬써서 hp 깎는걸로) 경험치 획득(몬스터 클래스 따로만들고)
        // 모험가 경험치차면 전사,마법사 택1개 할 수 있게 전직(scan으로 하면될려나)
        // 각캐릭터마다 스텟 hp,mp,ex 등(캐릭터클래스(부모클래스) 만들어주고 상속)
        // 해보려고했지만 실패패패패패패패
        Adventurer ad = new Adventurer("미아리자바사냥꾼",100,100,300);
        Warrier war = new Warrier("끄악", 200, 200, 400);
        Wizard wiz = new Wizard("뜨악", 150, 300, 500);

        ad.Attack();
        ad.QSkill();
        ad.WSkill();

        war.Attack();
        war.QSkill();
        war.WSkill();

        wiz.Attack();
        wiz.QSkill();
        wiz.WSkill();

    }
}
