public class Home8 {
    public static void main(String[] args) {
        // 1 ~ 100까지 숫자를 순회한다.
        // 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.
        // 1 ~ 100까지 숫자를 순회한다 - for 문을 반복하여 1에서 100까지 숫자 순회
        // 2 ~ 10사이의 랜덤 숫자 생정(Math.random())을 이용하여 숫자 선택
        // 이 숫자의 배수를 출력해보도록한다.
        // if문을 사용하여 i % 랜덤값 = 0 이면 배수를 뽑기
        // 다음에 출력
        final int START = 1;
        final int END = 100;
        final int REMIN = 0;
        final int MIN = 2;
        final int MAX =  10;
        final int range = MAX - MIN + 1;
        int rand = (int)(Math.random() * range + MIN);

        for(int i = START; i <= END; i++){
            if(i % rand == REMIN){
                System.out.println(i);
            }
        }
    }
}
