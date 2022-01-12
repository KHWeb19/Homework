public class reviewWork3_2 {
    public static void main(String[] args) {

        final int TOTAL = 45;
        final int SELECT = 5;

        boolean[] lottoBox = new boolean[TOTAL];
        int[] selectIdx = new int[SELECT];

        System.out.println("당첨 숫자 추첨!");

        boolean isRealloc = true;

        int lottoIdx = 0;
        int allocCnt = 0;

        for (int i = 0; i < SELECT;  i++) {
            while(isRealloc) {
                lottoIdx = (int)(Math.random() * TOTAL);
                // i를 SELECT크기만큼 돌려 난수를 생성
                isRealloc = false;

                for(int j = 0; j < allocCnt; j++) {
                    if (selectIdx[j] == lottoIdx) {
                        System.out.println("중복 발생!");
                        isRealloc = true;
                        break;
                    }
                }
            }
            // 숫자 중복이 날 수 있으니 중복체크부분을 추가
            lottoBox[lottoIdx] = true;
            selectIdx[allocCnt++] = lottoIdx;

            System.out.println("lottoBox[" + lottoIdx + "] = " + lottoBox[lottoIdx]);

            isRealloc = true;
        }
    }
}

//  1. 당첨 숫자 5개를 위한 자리 5개 만들기
//  2. for문을 이용하여 반복실행시켜 난수 5개 뽑기
//  3. 중복되는 숫자가 발생 할 수 있으니 중복을 체크하는 부분을 꼭 추가하기
//  4. for, if, while문을 모두 사용하기 때문에 각 문법에 대해서 더 잘 이해하도록 하기.
//  5. 지금 현재 lottoBox안 숫자가 0이 나오는 경우가 있어서 다시 한번 살펴보고 수정부분 찾기.