import java.nio.file.FileAlreadyExistsException;

public class Ans3 {
    public static void main(String[] args) {
        final int TOTAL = 100;
        final int SELECT = 5;

        boolean[] lottoBox = new boolean[TOTAL];
        int[] selectIdx = new int[SELECT];

        System.out.println("당첨되는 자리를 배치합니다.");

        int lottoIdx = 0, allocCnt=0;

        boolean isRealloc = true;
        for(int i = 0; i < SELECT; i++){ // 100자리 중 5개
            while(isRealloc) {
                lottoIdx = (int) (Math.random() * TOTAL);

                isRealloc = false;

                // 중복이 발생할 수 있음. 중복 여부를 체크하는 루틴 생성해야함.
                // 배열을 한개 더 생성해 배열에 값을 넣고 비교를 함.
                for (int j = 0; j < SELECT; j++) {
                    if (selectIdx[j] == lottoIdx) { // 중복인경우.
                        isRealloc = true;
                    }
                }
            }

            lottoBox[lottoIdx] = true;
            selectIdx[allocCnt++] = lottoIdx;

            //System.out.println(selectIdx[allocCnt++]);
            System.out.println("lottoBox[" + lottoIdx + "] = " + lottoBox[lottoIdx]);

            isRealloc = true;
        }
    }
}
