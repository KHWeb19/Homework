public class Adventurer implements Skills{

     String name;
     int age;
     int level;
     int attack;
     int defense;


    public Adventurer(String name, int age,int level,int attack,int defense){

        this.name = name;
        this.age=age;
        this. level= level;
        this. attack= attack;
        this.defense=defense;


    }

    @Override
    public void skillQ() {
        System.out.println("공격:"+attack); //공격의 값이 나옴
    }

    @Override
    public void skillW() {
        System.out.println("방어:"+defense);

    }

    public void gameStart(){


    }


}
