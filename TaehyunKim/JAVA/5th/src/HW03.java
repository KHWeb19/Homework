import java.util.Arrays;

public class HW03 {
    // Array 항목 100개 중 5개는 당첨
    // 랜덤한 숫자를 한개 뽑았을때 당첨인지 아닌지를 판정


    public static void main(String[] args) {

        final int MIN = 0;
        final int MAX = 99;
        final int RANGE = MAX - MIN + 1;

        final int SIZE = 100;

        int[] myArray = new int[SIZE];

        for (int i =0; i<5; i++){

            int randomNumber = (int) (Math.random() * RANGE + MIN);
            myArray[randomNumber] = randomNumber;
        }

        int myRandomNumber = (int) (Math.random() * RANGE + MIN);
        if (myArray[myRandomNumber] == myRandomNumber) {
            System.out.printf("축하합니다. %d는 당첨입니다.\n", myRandomNumber);
        }
        else{
            System.out.printf("%d는 꽝입니다.\n", myRandomNumber);
        }

        System.out.println(Arrays.toString(myArray));

    }
}
