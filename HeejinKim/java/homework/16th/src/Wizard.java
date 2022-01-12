public class Wizard extends Adventurer {
            //전기,불 공격을 넣어주고 싶은데
    int electro;
    int fire;

    public Wizard(String name, int age,int level,int attack,int defense,int electro,int fire){
        super(name,age,level,attack,defense);
        this.electro=electro;
        this.fire=fire;

    }

    @Override
    public void skillQ() {
        super.skillQ();
        System.out.println("파이어:"+ attack+fire);
    }

    @Override
    public void skillW() {
        super.skillW();
        System.out.println("일렉트로:"+attack+electro);
    }
}
