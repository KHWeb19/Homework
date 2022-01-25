public class Warrior extends Adventurer {

    int sword;
    public Warrior(String name, int age,int level,int attack,int defense,int sword){

        super(name,age,level,attack,defense);
        this.sword=sword;
    }

    @Override
    public void skillQ() {
        super.skillQ();
        System.out.println("찌르기: "+attack+sword);
    }

    @Override
    public void skillW() {
        super.skillW();
        System.out.println("베기: "+attack+sword*2);
    }
}
