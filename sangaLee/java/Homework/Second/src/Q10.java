public class Q10 {
    public static void main(String[] args) {


        // 65~90까지의 난수와 97~122까지의 난수를 무작위로 생성해봅시다.

        //1
        System.out.println("65~90 = " + (int)(Math.random()*(26)+65));

        //2
        int randomValue;
        randomValue = (int)(Math.random()*(26)+97);
        System.out.println("97~122 = " + randomValue);


    }
}
