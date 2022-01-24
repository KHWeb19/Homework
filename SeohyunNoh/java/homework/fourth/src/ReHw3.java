public class ReHw3 {
    public static void main(String[] args) {
        // boolean의 역할에 대한 이해가 아직 너무 부족하다
        // 다시다시다시!!!!
        final int TOTAL = 100;
        final int SELECT = 5;

        boolean[] lottobox = new boolean[TOTAL];
        int[] selectIdx = new int[SELECT];

        System.out.println("당첨되는 자리를 배치합니다.");

        //랜덤으로 뽑은 것이 중복인지 아닌지 확인하기 위해
        boolean isRealloc = true;

        //랜덤으로 뽑은 값은 lottoIdx
        int lottoIdx = 0;
        //값이 지정된 수
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

            // 당첨된 자리가 어딘지 판별하는 역할
            lottobox[lottoIdx] = true;
            selectIdx[allocCnt++] = lottoIdx;

            System.out.println("lottoBox[" + lottoIdx + "] = " + lottobox[lottoIdx]);

            //아래가 없다면 while문으로 다시 돌아갈 수 없게됨
            //while() << 조건식의 조건이 isRealloc = true입니까? 이기때문에
            //아래가 없으면 false;상태로 남아있어서 while문으로 진입할 수 없음
            isRealloc = true;
        }

    }
}
