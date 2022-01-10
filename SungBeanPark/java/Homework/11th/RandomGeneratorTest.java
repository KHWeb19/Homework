public class RandomGeneratorTest {
    public static void main(String[] args) {
        RandomGenerator rg = new RandomGenerator(4, 97); //4~97까지의 랜덤숫자 생성

        if(!rg.confirmRanDom()) {                                     //rg에 confirmRandom이 아니라면 문제가있고
            System.out.println("난수 생성에 문제가 있다");
        }else{                                                        // 그게 아니라면
            System.out.println("난수 생성: " + rg.intGenerate());       // rg.intGenerate를 호출하여 생성한다
        }

        RandomGenerator rg2 = new RandomGenerator(65, 90, 97, 122); //4~97까지의 랜덤숫자 생성

        if(!rg2.confirmComplicatedRandom()) {
            System.out.println("난수 생성에 문제가 있다");
        }else{
            System.out.println("복합 난수 생성: " + rg2.complicatedRandom());
        }

        RandomGenerator rg3 = new RandomGenerator(
                65, 122,
                65, 90, 97, 122
        );

        System.out.println("조건부 난수 생성: " + rg3.conditionRandom());
    }
}
