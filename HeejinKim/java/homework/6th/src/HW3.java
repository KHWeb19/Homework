public class HW3 {
    public static void main(String[] args) {

        final int TOTAL = 100;
        final int SELECT = 5;

        int[] lottoBox = new int[TOTAL];
        int[] selectIdx = new int[SELECT];                   //100개의 배열과 5개의 배열을 만들어줌


        int lottoIdx = 0;
        int doubleCheck=0;
        boolean check = true;

        for (int i = 0; i < SELECT; i++) {                    //5개의 랜덤배열을 만들어줌

            while (check) {
                lottoIdx = (int) (Math.random() * TOTAL);
                check = false;                                //하나의 랜덤 수가 생성되면 while을 빠져나감

                //그런데 중복발생이 할수도 있다...
                //하나의 루틴이 더 필요하겠다...
                // 다시 이것의 랜덤으로 뽑아진 수와 지금 랜덤으로 뽑은수를 비교하는
                //순서 for문을 만들고 거기에 if문을 넣어서 서로 비교하도록하자!
                //그럼 for문은 최대 4번만 돌면 된다

                for (int j = 0; j < doubleCheck; j++) {

                    if (selectIdx[j] == lottoIdx) {
                        System.out.println("중복발생! 다시");
                        check = true;
                        break;                          //이 for문을 빠져나가 while로 들어가게됨

                    }

                }

            }
            selectIdx[doubleCheck++] = lottoIdx;         //  selectIdx의 배열안에   랜덤 생성된 lottoIdx 을 넣어주고
                                                         //  순차적으로 하나하나씩 중복 검사를 위해서 doubleCheck++를 넣어준다
                                                         //그리고난 결과를 다시 도출해 낸다
            System.out.println("lottoBox[" + lottoIdx + "]");
            check=true;
            //  while 문에서  check = false;  로 끝났기 때문에
            //  selectIdx의 배열에 랜덤한 숫자가 나왔으면
            //  check=true;  로 만들어 다시  while을 돌고 그 안의 for문 등을 돌수 있게 한다

        }

    }
}
