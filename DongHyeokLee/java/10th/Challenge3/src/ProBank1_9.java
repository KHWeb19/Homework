public class ProBank1_9 {
    // 4 ~ 97까지의 랜덤 숫자를 생성해보세요.
    // 65 ~ 90까지의 난수와 97 ~ 122까지의 난수를 무작위로 생성해봅시다.
    public static void main(String[] args) {
        RandomNumber ran = new RandomNumber(4, 97);
        System.out.println(ran.numberGenerate());



        RandomNumber ran3 = new RandomNumber(65,90,97, 122);
        //ran3.randomNum();
        ran3.numberGenerate5();





    }

}
