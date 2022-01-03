public class Homework3 {
    public static void main(String[] args) {
//배열로 로또 문제를 만들어보기!
        //   실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //   실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자! -> 100분의 5확률
        //   배열값에 당첨되는 자리를 배치해놓고 ---> 이거 랜덤으로 하는건가? 아닌가?
        //   사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        // 1.100길이의 배열 생성
        // 2. 5개의 당첨 자리 생성
        // 3. 사용자 뽑기

        final int START = 0;
        final int END = 5;
        final int MAX = 100;
        String[] lotto = new String[MAX];
        int winning;

        for (int i = START; i < END; i++) {
            winning = (int) (Math.random() * MAX); // 0~99 100개의 숫자 생성

            lotto[winning] = "당첨"; //5개의 당첨
            System.out.printf("당첨번호 %d\n", winning); //당첨 번호 5개 설정
        }

        int pick = (int) (Math.random() * MAX); // 사용자 숫자 선택

        if (lotto[pick] == "당첨") {
            System.out.printf("숫자 %d는 %s 입니다.\n", pick, lotto[pick]);
        } else {
            System.out.printf("숫자 %d는 꽝입니다.\n", pick);
        }


        }
    }



















