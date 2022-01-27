public class Ans8 {
    public static void main(String[] args) {


   /*2명이 주사위 게임을 한다. (배열 활용) ->
        주사위는 각자 2개씩 굴릴 수 있다.-> 두개씩 인가 두번인가 -> 두번으로갑시당
        처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
        (2, 4, 6, 8, 10, 12)
        한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
        (특수 스킬 주사위는 1번만 굴린다) -> 한개만 돌린다는건가
        이 특수 스킬들은 1, 3, 4, 6에서 동작한다.
        1번의 경우 상대방의 주사위 눈금을 2 떨군다.
        3번의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
        4번의 경우 그냥 패배 처리한다.
        6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
        2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다.*/

        //2명 (배열을 어디활용하지  주사위 숫자에?)
        // 2개씩 주사위 굴림 주사위 하나 1~6 두개 1~6 값을 더한다
        // 더해서 짝수면 한번더 돌린다 짝수가아니면 상대방차례
        // 1 ,3 ,4 ,6일경우 스킬발동
        // 상대방 던질 차례

        //  도무지 정리가 안돼서 포기 ㅠㅠ -> 살..살리고싶다
        // 흐름
        // 플레이어들이 주사위를 던짐
        //그합이 짝수인경우 -> 특수주사위 던지기 -> 특수능력 발동
        // 음수인경우 0으로변경, 패배인경우 패배선언
        // 위의 경우를 제외한 결과 승부 판정하기

        // 플레이어
        //주사위
        //특수스킬

        final int PLAYER_NUM = 2;
        final int DICE_NUM = 2;

        final int SKILL_NUM1 = 1;
        final int SKILL_NUM2 = 3;
        final int SKILL_NUM3 = 4;
        final int SKILL_NUM4 = 6;

        final int WIN = 30;

        final int MAX = 6;
        final int MIN = 1;

        int range = MAX - MIN + 1;
        int[] diceSum = new int[PLAYER_NUM];
        int[] sum = new int[PLAYER_NUM];
        int special, i;

        boolean order = true;
        // 주사위를 한번씩 돌아가면서 던지게 하고싶음
        // 특정 숫자 달성하면 승리하게 하고 싶음
        //와 이거 못하겠네 그럼 만약에 첫뻔째 던진사람이 두번쨰 던진사람 뒤로 가게하면 그건 또 0으로 설정해야되네
        while (order) {
            for (i = 0; i < PLAYER_NUM; i++) {
                if (sum[i] < 0) {
                    sum[i] = 0;
                } //음수인 경우 0으로 변경

                for (int j = 0; j < DICE_NUM; j++) { //주사위 두번던짐
                    int dice = (int) (Math.random() * range + MIN);
                    diceSum[i] += dice;
                }

                sum[i] += diceSum[i]; // 이동한 칸을 sum으로 따로 저장

                System.out.println(diceSum[i] + "만큼 이동하시오");

                if (diceSum[i] % 2 == 0) {
                    System.out.println(i + 1 + "번 플레이어는 특수주사위를 던지시오");
                    special = (int) (Math.random() * range + MIN);

                    if (special == SKILL_NUM1) {
                        for (int j = 0; j < PLAYER_NUM; j++) { //본인에게 적용되는 효과가 없을시에 사용
                            if (i == j) {
                                continue;
                            }
                            sum[j] -= 2;
                            System.out.println("상대방은 뒤로 두칸가시오");
                        }

                    } else if (special == SKILL_NUM2) {
                        for (int j = 0; j < PLAYER_NUM; j++) {
                            sum[j] -= 6;

                        }
                        System.out.println("모두 뒤로 여섯칸 가시오");
                    } else if (special == SKILL_NUM3) {
                        System.out.println("플레이어" + i + 1 + "님의 패배입니다");
                        order = false;
                        break;

                    } else if (special == SKILL_NUM4) {
                        for (int j = 0; j < PLAYER_NUM; j++) {
                            if (j == i) {
                                continue;
                            }

                            sum[j] -= 3;
                            sum[i] += 3;
                            System.out.println("모든 상대방은 뒤로 세칸 본인은 앞으로 세칸가시오");
                        }

                    } else {
                        sum[i] += special;


                        System.out.println(special + "만큼 전진하시오");
                    }

                }


                if (sum[i] >= WIN) {
                    order = false;
                    System.out.println(i + 1 + "플레이어의 승리입니다");
                    break;
                } else {
                    System.out.println(i + 1 + "번 플레어님의 현재 위치 = " + sum[i]);
                    System.out.println("상대방이 던질 차례입니다.");


                }
                diceSum[i] = 0; // 초기화 안시키면 주사위 숫자가 계속 커짐
            }

        }
    }
}

