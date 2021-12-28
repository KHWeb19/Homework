import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        final int MAX = 6, MIN = 1;
        int[] dice1 = new int[]{1,2,3,4,5,6};
        int[] dice2 = new int[]{1,2,3,4,5,6};
        int[] specialdice = new int[]{1,2,3,4,5,6};
        int result = 0, result1 = 0, result2 = 0;
        boolean user1 = true, user2 = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("주사위 게임을 몇번 진행할까요??");

        int end = scan.nextInt();

        for (int i = 1; i <= end; i++) {
            System.out.printf("%d번째 게임입니다.\n", i);
            user1 = true; user2 = true;

            while (user1) {
                result = 0;
                System.out.println("유저1의 주사위를 굴립니다.");
                int rand1 = (int) (Math.random() * MAX );
                int rand2 = (int) (Math.random() * MAX );
                result = dice1[rand1] + dice2[rand2];
                result1 += result;
                System.out.printf("나온 주사위의 눈금은 %d %d 입니다.\n", dice1[rand1], dice2[rand2]);
                System.out.printf("두 주사위의 합은 %d 입니다\n", result);

                if ((dice1[rand1]+dice2[rand2]) % 2 == 0) {
                    System.out.println("축하합니다 합이 짝수가 나와 특수 주사위를 굴립니다.");
                    int rand3 = (int) (Math.random() * MAX);
                    System.out.printf("특수 주사위의 값은 %d 입니다.\n",specialdice[rand3]);
                    if (specialdice[rand3] == 1) {
                        result2 -= 2;
                    } else if (specialdice[rand3] == 2 || specialdice[rand3] == 5) {
                        result1 += specialdice[rand3];
                    } else if (specialdice[rand3] == 3) {
                        result1 -= 6;
                        result2 -= 6;
                        if (result1 < 0) {
                            result1 = 0;
                        }
                        if (result2 < 0) {
                            result2 = 0;
                        } else if (specialdice[rand3] == 4) {
                            System.out.println("특수주사위 4번이 나와 패배하였습니다.");
                            user1 = false;
                        } else if (specialdice[rand3] == 6) {
                            result1 += 3;
                            result2 -= 3;
                        }
                    }
                }
                System.out.printf("유저1의 %d번째 주사위 게임의 결과는 %d 입니다.\n",i, result1);
                user1 = false;
            }
            while (user2) {
                result = 0;
                System.out.println("유저2의 주사위를 굴립니다.");
                int rand1 = (int) (Math.random() * MAX);
                int rand2 = (int) (Math.random() * MAX);
                result = dice1[rand1] + dice2[rand2];
                result2 += result ;
                System.out.printf("나온 주사위의 눈금은 %d와 %d 입니다.\n", dice1[rand1], dice2[rand2]);
                System.out.printf("두 주사위의 합은 %d 입니다\n", result);

                if ((dice1[rand1]+dice2[rand2]) % 2 == 0) {
                    System.out.println("축하합니다 합이 짝수가 나와 특수 주사위를 굴립니다.");
                    int rand3 = (int) (Math.random() * MAX);
                    System.out.printf("특수 주사위의 값은 %d 입니다.\n",specialdice[rand3]);
                    if (specialdice[rand3] == 1) {
                        result2 -= 2;
                    } else if (specialdice[rand3] == 2 || specialdice[rand3] == 5) {
                        result2 += specialdice[rand3];
                    } else if (specialdice[rand3] == 3) {
                        result1 -= 6;
                        result2 -= 6;
                        if (result1 < 0) {
                            result1 = 0;
                        }
                        if (result2 < 0) {
                            result2 = 0;
                        } else if (specialdice[rand3] == 4) {
                            System.out.println("특수주사위 4번이 나와 패배하였습니다.");
                            user2 = false;
                            break;
                        } else if (specialdice[rand3] == 6) {
                            result2 += 3;
                            result1 -= 3;
                        }
                    }

                }
                System.out.printf("유저2의 %d번째 주사위 게임의 결과는 %d 입니다.\n",i, result2);
                user2 = false;
            }
        }
    }
}
