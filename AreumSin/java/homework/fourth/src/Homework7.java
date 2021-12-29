public class Homework7 {
    public static void main(String[] args) {
        //7. 1 ~ 100까지 숫자중 4의 배수를 더한 결과를 출력해보자!

        final int START = 1;
        final int END = 100;
        final int NUMBER =4;

        for (int i = START; i <= END; i++){
            if(i % NUMBER == 0){
                System.out.printf("%d의 배수 : %d\n",NUMBER,i);
            }
        }
    }
}
