public class ReHw3 {
    public static void main(String[] args) {
        // boolean의 역할에 대한 이해가 아직 너무 부족하다
        // 다시다시다시!!!!
        final int TOTAL = 100;
        final int SELECT = 5;

        boolean[] lottobox = new boolean[TOTAL];
        int[] selectIdx = new int[SELECT];

        System.out.println("당첨되는 자리를 배치합니다.");

        boolean isRealloc = true;

        int lottoIdx = 0;
        int allocCnt = 0;

        for(int i = 0; i < SELECT ; i++){
            while(isRealloc){
                lottoIdx = (int)(Math.random() * TOTAL);

                isRealloc = false;

                for(int j = 0; j < allocCnt ; j++){
                    if(selectIdx[j] == lottoIdx){
                        System.out.println("중복발생!");
                        isRealloc = true;
                        break;
                    }
                }
            }

            lottobox[lottoIdx] = true;
            selectIdx[allocCnt++] = lottoIdx;

            System.out.println("lottoBox[" + lottoIdx + "] = " + lottobox[lottoIdx]);

            isRealloc = true;
        }

    }
}
