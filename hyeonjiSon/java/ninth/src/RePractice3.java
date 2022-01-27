public class RePractice3 {
    public static void main(String[] args) {
        //Answer을 참고하여 제대로 된 버전을 만들어보자
        //배열로 로또 문제를 만들어보기!
        //   10명 중 5명이 당첨되도록 만들어보자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        final int TOTAL = 10;
        final int CHOOSE = 5;

        boolean[] lottoBox = new boolean[TOTAL]; //로또박스 [배열숫자] = true/false로 값이 정해질 수 있는 배열
        int[] chooseNum = new int[CHOOSE]; // 선택된번호 [배열숫자] = 중복 검사에 사용할 배열

        System.out.println("당첨 번호를 발표합니다.");

        boolean dupCheck = true; // 중복 검사용

        int lottoNum = 0; // 랜덤 로또 번호
        int dupNum = 0; // 중복 검사할 때 번호를 백업해줄 변수

        for (int i = 0; i < CHOOSE; i++) { //i가 0~4가 될 때 까지, 총 5번 돌아가는 반복문
            while (dupCheck) {
                lottoNum = (int) (Math.random() * TOTAL);

                dupCheck = false;

                for (int j = 0; j < dupNum; j++) {
                    if (chooseNum[j] == lottoNum) {
                        System.out.println("중복 발생!");
                        dupCheck = true;
                        break;
                    }
                }
            }

            lottoBox[lottoNum] = true;

            //여기에서부터 중복 발생 여부를 체크하는 루틴을 만들어준다!
            chooseNum[dupNum++] = lottoNum; //로또번호의 값을 dupNum(중복숫자)+1에 백업해준다.
            // +1 해주는 이유: 반복문 3 for(int j = 0; j < dupNum; j++)에 걸리지 않기 위해서

            System.out.println("lottoBox[" + lottoNum + "] = " + lottoBox[lottoNum]);


            dupCheck = true; // boolean값을 다시 true로 바꿔주어 반복문 1 처음으로 돌아가게 함
        }
    }
}
