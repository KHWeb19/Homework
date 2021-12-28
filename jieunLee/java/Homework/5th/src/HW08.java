public class HW08 {
    public static void main(String[] args) {
        //8. 2명이 주사위 게임을 한다. (배열 활용)

        //   인덱스0은 주사위의합 인덱스1은 점수
        //1) 유저의 배열에 주사위의합, 점수 넣기
        //2) 합이 짝수면 특수 주사위 돌리기
        //3) 특수값에 따라 유저1과 유저2의 주사위, 점수 변형
        //4) 다음 유저도 똑같이 진행
        //5) 점수가 0 아래로 떨어지면 0으로 만들기
        //6) 점수에 따라 승패 정하기
        boolean lose1 = false;
        boolean lose2 = false;
        int rand1, rand2, rand3;
        int[] user1 = new int[2];
        int[] user2 = new int[2];
        //1)
        rand1 = (int) (Math.random() * 6 + 1);
        rand2 = (int) (Math.random() * 6 + 1);
        user1[0] = rand1 + rand2;
        rand1 = (int) (Math.random() * 6 + 1);
        rand2 = (int) (Math.random() * 6 + 1);
        user2[0] = rand1 + rand2;
        System.out.println("두개의 주사위를 던집니다.");
        System.out.printf("user1= %d\n", user1[0]);
        System.out.printf("user2= %d\n", user2[0]);
        //2)
        if (user1[0] % 2 == 0) {
            rand3 = (int) (Math.random() * 6 + 1);
            System.out.printf("특수 주사위를 던집니다. ");
            System.out.printf("user1= %d\n", rand3);
            //3)
            if (rand3 == 1) {
                user1[1] = user1[0];
                user2[0] -= 2;
            } else if (rand3 == 2 || rand3 == 5) {
                user1[1] = user1[0] + rand3;
            } else if (rand3 == 3) {
                user1[1] = user1[0] - 6;
                user2[1] = user2[0] - 6;
            } else if (rand3 == 4) {
                lose1 = true;
            } else if (rand3 == 6) {
                user1[1] = user1[0] + 3;
                user2[1] = user2[0] - 3;
            }
        } else {
            user1[1] = user1[0];
        }
        //4)
        if (user2[0] % 2 == 0) {
            rand3 = (int) (Math.random() * 6 + 1);
            System.out.printf("특수 주사위를 던집니다. ");
            System.out.printf("user2= %d\n", rand3);
            if (rand3 == 1) {
                user2[1] = user2[0];
                user1[0] -= 2;
            } else if (rand3 == 2 || rand3 == 5) {
                user2[1] = user2[0] + rand3;
            } else if (rand3 == 3) {
                user1[1] = user1[0] - 6;
                user2[1] = user2[0] - 6;
            } else if (rand3 == 4) {
                lose2 = true;
            } else if (rand3 == 6) {
                user1[1] = user1[0] - 3;
                user2[1] = user2[0] + 3;
            }
        } else {
            user2[1] = user2[0];
        }
        //5)
        if (user1[1]<0) {
            user1[1]=0;
        } else if (user2[1]<0) {
            user2[1]=0;
        }
        //6)
        if (lose1 && lose2) {
            System.out.println("무승부입니다.");
        } else if (lose1) {
            System.out.println("user1= 패배하였습니다.");
            System.out.println("user2= 승리하였습니다.");
        } else if (lose2) {
            System.out.println("user1= 승리하였습니다.");
            System.out.println("user2= 패배하였습니다.");
        } else {
            if (user1[1]==user2[1]) {
                System.out.println("무승부입니다.");
            } else if (user1[1]>user2[1]) {
                System.out.println("user1= 승리하였습니다.");
                System.out.println("user2= 패배하였습니다.");
            } else {
                System.out.println("user1= 패배하였습니다.");
                System.out.println("user2= 승리하였습니다.");
            }
        }

    }
}
