public class HW3_1 {
    //선생님 버전

        public static void main(String[] args) {


            final int TOTAL = 100;
            final int SELECT = 5;

            boolean[] lottoBox = new boolean[TOTAL];
            int[] selectIdx = new int[SELECT];

            System.out.println("당첨되는 자리를 배치합니다.");

            boolean isRealloc = true;

            int lottoIdx = 0;
            int allocCnt = 0;

            for (int i = 0; i < SELECT; i++) {      // 총 5개 배치
                while (isRealloc) {
                    lottoIdx = (int) (Math.random() * TOTAL);

                    isRealloc = false;

                    for (int j = 0; j < allocCnt; j++) {
                        if (selectIdx[j] == lottoIdx) {
                            System.out.println("중복 발생!");
                            isRealloc = true;
                            break;
                        }
                    }
                }

                lottoBox[lottoIdx] = true;
                selectIdx[allocCnt++] = lottoIdx;
                System.out.println("lottoBox[" + lottoIdx + "] = " + lottoBox[lottoIdx]);

                isRealloc = true;
            }
        }
    }

