public class As10 {
    //1 ~ 100까지의 숫자를 순회
    //2 ~ 10 사이의 랜덤한 숫자를 선택
    //랜덤한 숫자가 나온만큼 이동
    //이동했을 떄 나온 숫자들의 합
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN +1;
        int rand = 0;
        int sum = 0;

        //1 ~ 100 까지 순회하는 중 랜덤 숫자를 선택하고 그 숫자만큼 이동하므로
        //for 문 증감식에 i++가 아닌 i += rand 로 해야 한다.

        for(int i = START; i <= END; i += rand){
            rand = (int)(Math.random() * range + MIN);
            //i의 초기값을 1로 설정하였으므로 초기 이동한 위치는 1로 설정
            System.out.printf("랜덤 숫자: %d   현재 이동한 위치: %d\n ",rand,i);
            sum += i;

        }
        System.out.println("전체 이동의 합: " + sum);
   }
}

