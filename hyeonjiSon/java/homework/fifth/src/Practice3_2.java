public class Practice3_2 {
    public static void main(String[] args) { //Answer을 참고하여 제대로 된 버전을 만들어보자
        //배열로 로또 문제를 만들어보기!
        //   10명 중 5명이 당첨되도록 만들어보자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        final int TOTAL = 10;
        final int CHOOSE = 5;

        boolean[] lottoBox = new boolean[TOTAL]; //로또박스 [배열숫자] = true/false로 값이 정해질 수 있는 배열

        boolean dupCheck = true; // 중복 검사용
        int lottoNum = 0; // 랜덤 로또 번호

        for(int i = 0; i < CHOOSE; i++ ){ //i가 0~4가 될 때 까지, 총 5번 돌아가는 반복문
            while(dupCheck){
                lottoNum = (int)(Math.random() * TOTAL);

                dupCheck = false;

            }

            lottoBox[lottoNum] = true;

            System.out.println("lottoBox[" + lottoBox + "] = " + lottoBox[lottoNum]);
        }

        //아직 중복 검사 부분을 넣지 않은 미완성입니다. 그런데 이거 출력 결과가 lottoBox[[Z@dfd3711] = true < 로 이상하게 나와요ㅠ
        //중복이 있어도 숫자가 떠야하는 건데 왜 이러는 걸까요?

    }
}
