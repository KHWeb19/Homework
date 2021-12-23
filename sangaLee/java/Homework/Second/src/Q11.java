public class Q11 {
    public static void main(String[] args) {


        // 65~122까지의 난수를 무작위로 생성하고 65~90혹은 97~122에 해당하는 숫자만 출력해봅시다.
        int rand = (int)(Math.random()*(58)+65);

        if ( rand > 65 && 90 > rand ) {
            System.out.println(rand);
        } else {
            if ( rand > 97 && 122 > rand ) {
                System.out.println(rand);
            }
        }


    }
}
