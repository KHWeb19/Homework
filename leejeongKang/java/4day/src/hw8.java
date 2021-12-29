public class hw8 {
    public static void main(String[] args) {

        final int MAX = 6, MIN = 1;
        final int range = MAX - MIN;

        int[] dice1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] dice2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] diceSpecial = new int[]{1, 2, 3, 4, 5, 6};

        int user1 = 0;
        int user2 = 0;

        boolean user1First = true;
        boolean user2Second = true;
        boolean game = true;



        for (int i = 1; i < 4; i++) {

            System.out.printf("\n\n===========%d번째 게임===========\n",i);

            while (user1First) {
                int rand1 = (int) (Math.random() * range + MIN);
                int rand2 = (int) (Math.random() * range + MIN);

                System.out.printf("<User1차례> 주사위2개를 굴리세요 : %d + %d = %d\n", dice1[rand1], dice2[rand2], (dice1[rand1]+dice2[rand2]));
                user1 += (dice1[rand1]+dice2[rand2]);
                System.out.printf("user1의 점수 : %d\n", user1);

                if ((dice1[rand1]+dice2[rand2]) % 2 == 0) {
                    while (game) {
                        int rand3 = (int) (Math.random() * range + MIN);
                        System.out.printf("짝수입니다!특별한 주사위를 굴리세요 : %d\n", diceSpecial[rand3]);
                        game = false;

                        if (diceSpecial[rand3] == 1) {
                            user2 -= 2;
                            System.out.printf("user1의 점수 : %d\n", user1);
                            game = false;

                        } else if (diceSpecial[rand3] == 3) {
                            user1 -= 6;
                            user2 -= 6;
                            if (user1<0 ){
                                user1 =0;
                            }
                            else if (user2<0){
                                user2=0;
                            }
                            System.out.printf("user1의 점수 : %d\n", user1);
                            game = false;

                        } else if (diceSpecial[rand3] == 4) {
                            System.out.println("*****USER1 패배");
                            System.out.printf("user1의 점수 : %d\n", user1);
                            game = false;

                        } else if (diceSpecial[rand3] == 6) {
                            user2 -= 3;
                            user1 += 3;
                            if (user2<0 ){
                                user2 =0;
                            }
                            System.out.printf("user1의 점수 : %d\n", user1);
                            game = false;

                        }
                        else{
                            user1 +=diceSpecial[rand3];
                            System.out.printf("user1의 점수 : %d\n", user1);
                            game = false;
                        }

                        user1First = false;
                        user2Second = true;

                    }
                } else {
                    user1 = user1;
                    System.out.printf("user1의 최종점수 : %d\n", user1);
                    user1First = false;
                    user2Second = true;

                }

            }

            while (user2Second) {
                int rand1 = (int) (Math.random() * range + MIN);
                int rand2 = (int) (Math.random() * range + MIN);

                int sum_user2 = (dice1[rand1] + dice2[rand2]);
                System.out.printf("<User2차례> 주사위2개를 굴리세요 : %d + %d = %d\n", dice1[rand1], dice2[rand2], sum_user2);
                user2 += sum_user2;
                System.out.printf("user2의 점수 : %d\n", user2);

                if (sum_user2 % 2 == 0) {
                    while (game) {
                        int rand3 = (int) (Math.random() * range + MIN);
                        System.out.printf("짝수입니다!특별한 주사위를 굴리세요 : %d\n", diceSpecial[rand3]);
                        game = false;

                        if (diceSpecial[rand3] == 1) {
                            user1 -= 2;
                            System.out.printf("user2의 점수 : %d\n", user2);
                            game = false;

                        } else if (diceSpecial[rand3] == 3) {
                            user1 -= 6;
                            user2 -= 6;
                            if (user1<0 ){
                                user1 =0;
                            }
                            else if (user2<0){
                                user2=0;
                            }
                            System.out.printf("user2의 점수 : %d\n", user2);
                            game = false;

                        } else if (diceSpecial[rand3] == 4) {
                            System.out.println("*****USER2 패배");
                            System.out.printf("user1의 점수 : %d\n", user2);
                            game = false;

                        } else if (diceSpecial[rand3] == 6) {
                            user1 -= 3;
                            user2 += 3;
                            if (user1<0 ){
                                user1 =0;
                            }
                            System.out.printf("user2의 점수 : %d\n", user2);
                            game = false;

                        }
                        else{
                            user2 +=diceSpecial[rand3];
                            System.out.printf("user2의 점수 : %d\n", user2);
                            game = false;
                        }

                        user2Second = false;
                        user1First = true;


                    }
                } else {

                    System.out.printf("user2의 최종점수 : %d\n", user2);
                    user1First = true;
                    user2Second = false;

                }

            }



            }
        }
    }
