public class LottoIdx {

    static final int TOTAL = 100;
    final int SELECT= 5;

    static int lottoIdx = 0;
    static boolean[] lottoBox = new boolean[TOTAL];
    int[] selectIdx = new int[SELECT];

    boolean isRealloc = true;
    int allCnt = 0;

    //5개 랜덤 숫자 지정
    //lottBox에 당첨 숫자 5개 들어감
    //이것을 100명중 5명이 당첨인지 ?? 어떻게 아냐
    //상상을 해봅시다
    // 100명이 이제 식장에 들어오면서 각자 0~99의 번호를 하나씩 받음
    // 그럼 일단 100명의 사람들에게도 번호를 부여해야겠네
       public void initLottoIdx() {


               for (int i = 0; i < SELECT; i++) {
                    while (isRealloc) {

                        lottoIdx = (int) (Math.random() * TOTAL);
                        isRealloc = false;
                    //중복방지
                        for (int j = 0; j < allCnt; j++ ) {
                            if (selectIdx[j] == lottoIdx) {
                            System.out.println("중복발생");
                            isRealloc = true;
                            break;

                       }

                   }
               }
                       lottoBox[lottoIdx] = true;
                       selectIdx[allCnt++] = lottoIdx;

                   System.out.println("lottoBox[" + lottoIdx + "] = " + lottoBox[lottoIdx]);

                   isRealloc = true;

           }
       }
}
