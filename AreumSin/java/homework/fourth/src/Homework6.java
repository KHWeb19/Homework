public class Homework6 {
    public static void main(String[] args) {
        //6. 1 ~ 100까지 숫자중 3의 배수만 출력해보자!

        final int START = 1;
        final int END = 100;
        final int NUMBER =3;

        for (int i = START; i <= END; i++){
            if(i % NUMBER == 0){
                System.out.printf("%d의 배수 : %d\n",NUMBER,i);
            }
        }
    }
}
