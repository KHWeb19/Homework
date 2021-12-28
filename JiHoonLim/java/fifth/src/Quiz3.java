public class Quiz3 {
    public static void main(String[] args) {
        /*
        1. 로또값 생성
        2. 중복을 제거하면서 어떻게 생성 --> 문제풀이로 해결
        3. 내가 뽑은 수와 같다면 당첨

        중복을 제거
        중복여부 루틴을 추가하여 중복제거

         */

        final int TOTAL = 100;
        final int SELECT = 5;

        boolean[] lottoBox = new boolean[TOTAL];
        int[] selectNum = new int[SELECT];

        boolean isRealloc = true;

        int lottoNum = 0;
        int allocCnt = 0;

        int mynum = (int)(Math.random() * TOTAL);
        System.out.println("내가 뽑은 번호는 " +mynum);

        // 5회 로또값 생성
        for (int i = 0; i < SELECT; i++) {
            while (isRealloc) {
                lottoNum = (int) (Math.random() * TOTAL);

                isRealloc = false;

                for (int j = 0; j < allocCnt; j++) {
                    if (selectNum[j] == lottoNum) {
                        System.out.println("중복");
                        isRealloc = true;
                        break;
                    }
                }
            }
            lottoBox[lottoNum] = true;
            selectNum[allocCnt++] = lottoNum;

            System.out.println("lottoBox[" + lottoNum + "] = " + lottoBox[lottoNum]);
            if (lottoNum == mynum){
                System.out.println("당첨입니다.");
            }
            isRealloc = true;
        }
    }
}
