public class Character{
    int skillNum;
    String[] skills;

    int job;
    WarriorSkill warriorSkill = new WarriorSkill();
    MagicianSkill magicianSkill =  new MagicianSkill();

    public Character(int skillNum){
        this.skillNum = skillNum;
        skills = new String[skillNum];
    }

    public void printSkill(int job){
        this.job = job;

        if(job == 1){

            System.out.println(warriorSkill.setQSkill());
            System.out.println(warriorSkill.setWSkill());
        }
        else if(job == 2){

            System.out.println(magicianSkill.setQSkill());
            System.out.println(magicianSkill.setWSkill());
        }
    }

}
