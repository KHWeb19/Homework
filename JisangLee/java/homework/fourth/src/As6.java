public class As6 {
    //1 ~ 100까지의 숫자 중 3의 배수만 출력
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int MULTIPLE = 3; //배수를 선택
        final int REMAIN = 0;

        System.out.printf("%d ~ %d까지의 숫자 중 %d의 배수만 출력\n",START,END,MULTIPLE);

        for(int i = START; i <= END; i++){
            if(i % MULTIPLE == REMAIN){
                System.out.println("          " + i);

            }
        }
    }
}
