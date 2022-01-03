public class Num8 {
    public static void main(String[] args) {
        /*
        2명이 주사위 게임을 한다. (배열 활용)
        주사위는 각자 2개씩 굴릴 수 있다.
        처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
        (2, 4, 6, 8, 10, 12)

        1번의 경우 상대방의 주사위 눈금을 2 떨군다.
        3번의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
        4번의 경우 그냥 패배 처리한다.
        6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
        2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다.
         */
        /*
        1. 2명 주사위 게임......배열을 어떻게 써야할까? 배열을 각각 쓸까?
        2. 1~6번 실행하려면...스위치 써야하나??
        3. 처음 주사위를  굴렸을때 결과가 짝수라면 ~> if문?
        랜덤 값으로 1~6 굴린다음, 짝수가 된다면 while문? 뭐가 더 좋을까.
        랜덤 한번 더하고 그 값으로 특수 번호 실행하기??
        *배열을 어떻게 활용해야하지? 랜덤 값 실행할때마다 배열 값이 입력을 해야하나?
         */

        final int FREIND = 2;
        int[] freind = new int[FREIND];

        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;
        int frand1 = 0, frand2 = 0;
        final int START = 0;

        for (int i = 0; i < FREIND; i++) {
            frand1 = (int) (Math.random() * range + MIN);
            freind[i] = frand1;
            System.out.printf("%d번째 친구 주사위값 : %d\n", (i + 1), freind[i]);

            if (freind[i] % 2 == 0) {
                System.out.println("한번 더 던져봐");
                frand2 = (int) (Math.random() * range + MIN); //주사위 한번 더 던지기
                System.out.printf("추가 주사위값 : %d\n", frand2);

                switch (frand2) {
                    case 1:
                        if(i==freind[1]){
                            freind[1] = freind[1] - 2; //다른 친구 주사위 값을 마이너스 시킬때 다른 값을 어떻게 넣어야할지 모르겠습니다.
                            System.out.printf("상대방의 주사위 눈금을 2 떨군다. 상대값 : %d\n", freind[2]);
                            break;
                        }else {
                            freind[0] = freind[0] - 2; //다른 친구 주사위 값을 마이너스 시킬때 다른 값을 어떻게 넣어야할지 모르겠습니다.
                            System.out.printf("상대방의 주사위 눈금을 2 떨군다. 상대값 : %d\n", freind[i + 1]);
                        }break;
                    case 2:
                    case 5:
                        freind[i] = frand1 + frand2;
                        System.out.printf("기본 값에 더하기 :%d\n", freind[i]);
                        break;
                    case 3: //경우 다 같이 -6을 적용한다.(0이하는 안됨)
                        System.out.printf("다같이 -6하기,0이하는 불가. f1=%d,f2=%d\n", freind[1] - 6, freind[2] - 6);
                        if (freind[0] <= 0 && freind[1] <= 0) {
                            System.out.println("무승부");
                        }
                        break;
                    case 4:
                        System.out.printf("%d친구는 패해했습니다.\n", (i+1));
                        break;
                    case 6: //모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
                        freind[i] = frand1 + 3;
                        freind[i+1] = frand1 - 3;
                        System.out.printf("상대방에게 3을 뺏어서 내거에 3을 더한다. 내꺼 : %d,상대방 : %d\n", freind[i], freind[i+1]);
                        break;
                }
            }else System.out.println("땡");
        }
    }
}






