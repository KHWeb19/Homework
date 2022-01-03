public class Test {
    public static void main(String[] args) {
        //Lotto 프로그램을 작성하시오.
        //숫자 1 ~ 45 까지의 숫자 중 랜덤한 6개의 숫자를 고르시오.
        //중복의 숫자가 나오면 다시 고르시오.
        //final int START = 1;
        final int END = 6;
        final int MAX = 45;
        final int MIN = 1;
        int [] choice = new int[END];
        int range = MAX - MIN + 1;
        int allocCnt = 0;
        int rand = 0;
        Boolean isRealloc = true;
        System.out.println("로또 번호를 출력합니다!!!");

        for (int i = 0; i < END; i++) {
            while (isRealloc){
                rand = (int)(Math.random() * range + MIN);
                //System.out.printf("%d",rand);
                //choice[i] = rand;
            isRealloc = false;
            for (int j = 0; j < allocCnt; j++) {
                if (choice[j] == rand ) {
                    System.out.println("로또 번호를 다시 생성합니다~");
                    isRealloc = true;
                    break;
                }
            }
        }
           choice[allocCnt++] = rand;  // 0부터 1씩 올라가며 할당된 당첨 자리 횟수가 4까지 올라간다.

            System.out.println("        "+ choice[i]);

            isRealloc = true;
        }
    }
}


