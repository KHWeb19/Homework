public class Adventurer implements Skill{
    String name;
    int attack, qskill, wskill;

    public Adventurer(String name, int attack, int qskill, int wskill){
        this.name = name;
        this.attack = attack;
        this.qskill = qskill;
        this.wskill = wskill;
    }


    public void Attack(){
        System.out.println("기본공격: " + attack);
    }


    public void QSkill(){
        System.out.println("Q스킬!!: " + qskill);
    }

    public void WSkill(){
        System.out.println("w스킬!!: " + wskill);

    }
}
