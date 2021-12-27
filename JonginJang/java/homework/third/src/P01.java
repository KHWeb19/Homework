public class P01 {
    public static void main(String[] args) {

        final int maxNum = 122;
        final int minNum = 65;

        int range = maxNum - minNum +1;

        boolean condition = false;

        while(!condition) {

            int randNum = (int) (Math.random() * range + minNum);
            if((randNum >=65 && randNum <=90)||(randNum >=97 && randNum <= 122)){
                condition = true;
                System.out.printf("생성된 문자 = %c(%d)\n", randNum, randNum);
            }
            else
                System.out.println("문자를 다시 생성합니다");

        }
    }
}
