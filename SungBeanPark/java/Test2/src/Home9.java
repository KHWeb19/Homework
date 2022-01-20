public class Home9 {
    public static void main(String[] args) {
        //1 ~ 100까지의 숫자를 순회한다.
        //for문을 사용하여 1~100까지의 숫자를 순회한다.
        //2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        //Math.random 숫자를 선택하고 이숫자의 배수를 출력!
        //다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        //다음 루프 = while을 사용한다 다시랜덤 숫자를 선택한다는 것은 for와 while에 랜덤함수를 넣어준다.
        //다음 해당숫자의 배수를 출력한다 -> if문을 사용하여 배수를 출력한다.
        //    그 다음 루프에서 다시 작업을 반복한다.
        //
        //    끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가
        final int START = 1;
        final int END = 100;
        final int MIN = 2;
        final int MAX = 10;
        final int REMIN = 0;
        final int range = MAX - MIN + 1;

        int rand = 0;
        int sum = 0;
        boolean isChar = false;

        for(int i = START; i <= END; i++){
            while(!isChar){
                rand = (int)(Math.random() * range + MIN);
                isChar = true;
            }
            if(i % rand == REMIN){
                System.out.printf("%d 의 배수 i = %d\n", rand,i);
                isChar = false;

                sum += i;
            }
        }
        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}
