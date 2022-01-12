public class Wizard extends Adventurer{

    public Wizard(String name, int attack, int qskill, int wskill){
        super(name, attack, qskill, wskill);
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
