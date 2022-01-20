public class hw3_answer {
    public static void main(String[] args) {
        final int TOTAL = 100;
        final int SELECT = 5;

        boolean[] lottoBox = new boolean[TOTAL];
        int[] selectIdx = new int[SELECT];

        System.out.println("당첨되는 자리를 배치합니다.");

        // 구현 전략
        // 1. 전체 100개 배열을 만듬
        // 2. 당첨 자리 5개 랜덤하게 할당
        // 3. 할당된 자리 중 중복이 존재할 가능성도 있으므로 검사해야함
        //    선택된 인덱스는 0 ~ 99 사이의 랜덤값임
        //    그렇다면 어떻게 이 랜덤 인덱스의 중복 여부를 판정할 것인가 ?
        //    실제 SELECT는 5개이므로
        //    이 SELECT를 활용한 5개 배열에 할당된 랜덤 인덱스를 배치하면 어떨까 ?
        //    그럼 검사를 최악의 경우라고 가정하더라도 최대 4개만 하면 된다.

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


// 이대로 가면 무엇을 놓치게 될까 ? 중복을 놓치게됨
            // 그러므로 중복 발생 여부를 체크하는 루틴이 추가로 필요해짐!

            System.out.println("lottoBox[" + lottoIdx + "] = " + lottoBox[lottoIdx]);

            isRealloc = true;
        }
    }
}
