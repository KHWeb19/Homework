public class Homework5 {
    public static void main(String[] args) {
        //5. 1 ~ 100까지 숫자중 짝수만 출력해보자.

        final int START = 1;
        final int END = 100;
        final int NUMBER =2;

        for (int i = START; i <= END; i++){
            if(i % NUMBER == 0){
                System.out.println("짝수 : "+i);
            }
        }
    }
}
