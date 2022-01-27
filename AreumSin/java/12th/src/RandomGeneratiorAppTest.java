public class RandomGeneratiorAppTest {
    public static void main(String[] args) {
        RandomGenerator rg = new RandomGenerator(
                65, 122,
                65, 90, 97, 122
        );

        char num = (char) rg.conditionRandom();
        System.out.printf("조건부 난수 생성: %c (%d) " ,num , rg.conditionRandom());
    }
}
