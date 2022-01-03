public class Homework3 {
    public static void main(String[] args) {
        //100명 중 5명을 뽑아보도록 하자!
       //배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.
        /* 내가 이해한 방법
        1. 1~100을 순회하는 for문 만들고
        2. min=1 max=5로 5개의 랜덤값을 추출하고
        3. int [] lucky; << 당첨되는 배열값 설정
        4. for문 내부에 if문을 넣어서
           랜덤숫자에 할당된 arr[]숫자가 77이라면 "당첨"출력
        ex)랜덤값 추출로 3이 뽑히면 -> 3이 뽑은 숫자가 77이면 당첨
        그 후에 반복문을 빠져나와서 다시 랜덤값 추출 -> 36이 뽑혔고
        -> 36이 뽑은 숫자가 10이면 당첨이 아님
         */

        /*
        final int START = 1;
        final int END = 100;

        final int MIN = 1;
        final int MAX = 5;
        int range = MAX - MIN + 1;
        int rand = 1;

        //당첨되는 배열값 77
       final int LUCKY = 77;


        for(int i = START; i <= END; i++){
        }
         */

        // 어떻게 할지 모르겠어서 구글링을 해본 결과
        // 내가 이해한 방법이 틀린 거 같다
        // 그래서 로또번호 5개를 출력하는 방법부터 이해하기로했다

        final int START = 1;
        final int END = 100;

        //정수 5개를 할당할 배열을 설정
        int[] lotto = new int[5];

        for(int i = START; i < lotto.length; i++){
            //랜덤값을 생성해주기
            // **자꾸 결과값에 0이 나오길래 +1도 해보았지만
            // 0이 나온다
            lotto[i] = (int)(Math.random() * END) + 1;

            //배열안에 중복된 정수가 할당되면 안되므로
            //둘의 값이 같다면 i의 반복값을 줄이고 반복문을 탈출
            for(int j = 1; j < i; j++){
                if(lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.println(lotto[0]);
        System.out.println(lotto[1]);
        System.out.println(lotto[2]);
        System.out.println(lotto[3]);
        System.out.println(lotto[4]);
    }
}
