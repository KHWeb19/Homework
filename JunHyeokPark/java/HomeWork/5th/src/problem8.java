import java.util.Scanner;

public class problem8test {
    public static void main(String[] args) {
        final int MAX = 6;
        int[] dice1 = new int[]{1,2,3,4,5,6};
        int[] dice2 = new int[]{1,2,3,4,5,6};
        int[] specialdice = new int[]{1,2,3,4,5,6};
        int result1 , result2 ;
        boolean user1 , user2 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("주사위 게임을 몇번 진행할까요??");

        int end = scan.nextInt();

        for (int i = 1; i <= end; i++) {
            System.out.printf("%d번째 게임입니다.\n", i);
            user1 = true; user2 = true;
            result1 = 0; result2 = 0;
            while (user1) {
                System.out.println("유저1의 주사위를 굴립니다.");
                int rand1 = (int) (Math.random() * MAX );
                int rand2 = (int) (Math.random() * MAX );
                result1 = dice1[rand1] + dice2[rand2];
                System.out.printf("나온 주사위의 눈금은 %d %d 입니다.\n", dice1[rand1], dice2[rand2]);
                System.out.printf("두 주사위의 합은 %d 입니다\n", result1);

                if ((dice1[rand1]+dice2[rand2]) % 2 == 0) {
                    System.out.println("축하합니다 합이 짝수가 나와 특수 주사위를 굴립니다.");
                    int rand3 = (int) (Math.random() * MAX);
                    System.out.printf("특수 주사위의 값은 %d 입니다.\n",specialdice[rand3]);
                    if (specialdice[rand3] == 1) {
                        result2 -= 2;
                        System.out.println("특수 주사위1의 효과로 상대 결과에 -2를 적용합니다.");
                    } else if (specialdice[rand3] == 2 || specialdice[rand3] == 5) {
                        result1 += specialdice[rand3];
                        System.out.printf("특수 주사위%d 효과로 %d만큼 더합니다\n",rand3,rand3);
                    } else if (specialdice[rand3] == 3) {
                        result1 -= 6;
                        result2 -= 6;
                        System.out.println("특수 주사위3의 효과로 양쪽모두 -6을 적용합니다");
                        if (result1 < 0) {
                            result1 = 0;
                        }
                        if (result2 < 0) {
                            result2 = 0;
                        }
                    }else if (specialdice[rand3] == 4) {
                        System.out.println("특수주사위 4번이 나와 패배하였습니다.");
                        result1 = -100;
                        user1 = false;
                        break;
                    } else if (specialdice[rand3] == 6) {
                        result1 += 3;
                        result2 -= 3;
                        System.out.println("특수 주사위6의 효과로 상대 결과에서 3을 뺐어옵니다.");
                    }
                }
                System.out.printf("유저1의 %d번째 주사위 게임의 결과는 %d 입니다.\n",i, result1);
                user1 = false;
            }
            while (user2) {
                System.out.println("유저2의 주사위를 굴립니다.");
                int rand1 = (int) (Math.random() * MAX);
                int rand2 = (int) (Math.random() * MAX);
                result2 = dice1[rand1] + dice2[rand2];
                System.out.printf("나온 주사위의 눈금은 %d %d 입니다.\n", dice1[rand1], dice2[rand2]);
                System.out.printf("두 주사위의 합은 %d 입니다\n", result2);

                if ((dice1[rand1]+dice2[rand2]) % 2 == 0) {
                    System.out.println("축하합니다 합이 짝수가 나와 특수 주사위를 굴립니다.");
                    int rand3 = (int) (Math.random() * MAX);
                    System.out.printf("특수 주사위의 값은 %d 입니다.\n",specialdice[rand3]);
                    if (specialdice[rand3] == 1) {
                        result1 -= 2;
                        System.out.println("특수 주사위1의 효과로 상대 결과에 -2를 적용합니다.");
                    } else if (specialdice[rand3] == 2 || specialdice[rand3] == 5) {
                        result2 += specialdice[rand3];
                        System.out.printf("특수 주사위%d 효과로 %d만큼 더합니다\n",rand3,rand3);
                    } else if (specialdice[rand3] == 3) {
                        result1 -= 6;
                        result2 -= 6;
                        System.out.println("특수 주사위3의 효과로 양쪽모두 -6을 적용합니다");
                    }
                    if (result1 < 0) {
                        result1 = 0;
                    }
                    if (result2 < 0) {
                        result2 = 0;
                    } else if (specialdice[rand3] == 4) {
                        System.out.println("특수 주사위 4번이 나와 패배하였습니다.");
                        result2=-100;
                        user2 = false;
                        break;
                    } else if (specialdice[rand3] == 6) {
                        result2 += 3;
                        result1 -= 3;
                        System.out.println("특수 주사위6의 효과로 상대 결과에서 3을 뺐어옵니다.");
                    }

                }
                System.out.printf("유저2의 %d번째 주사위 게임의 결과는 %d 입니다.\n",i, result2);
                user2 = false;
            }
            if (result1>result2){
                System.out.printf("%d번째 게임은 유저1의 승리 입니다.\n",i);
            }
            else if(result1<result2){
                System.out.printf("%d번째 게임은 유저2의 승리 입니다.\n",i);
            }
            else if(result1==result2){
                System.out.printf("%d번째 게임은 무승부 입니다.\n",i);
            }
        }
    }
}
