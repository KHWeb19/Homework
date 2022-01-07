public class RandomGeneratorTest {
    public static void main(String[] args) {
        RandomGenerator rg=new RandomGenerator(4,97);//4~97까지의 랜덤 난수를 생성

        if(!rg.confirmRandom()){
            System.out.println("난수 생성에 문제 있음");
        }
        else {
            System.out.println("난수생성 "+rg.intGenerate());
        }

        RandomGenerator rg2=new RandomGenerator(65,90,97,122);

        if(!rg2.confirmComplicatedRandom()){//저 메소드에서 벗어나는게 없다고 하면 복합난수를  생성하고
            System.out.println("난수생성에 문제있음");
        }
        else{
            System.out.println("복합난수생성"+rg2.confirmComplicatedRandom());
        }
    RandomGenerator rg3=new RandomGenerator(65,122,65,90,97,122);
        System.out.println("조건부 난수 생성 "+rg3.conditionRandom());
    }


}
