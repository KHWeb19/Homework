public class Num3Again {
    public static void main(String[] args) {
         /*  배열로 로또 문제를 만들어보기!
            실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
            실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
            배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다. */

        // 100명중에 5명만 당첨될수 있다. 1~100랜덤값중에 5명만 for 반복해서 값 출력
        // 5개가 중복인지 아닌지 체크하기 -> for문으로 같은지 안같은지 추가 체크

        final int TOTAL = 100;
        final int SELECT = 5;

        int[] selectIdx = new int[SELECT];
        System.out.println("당첨되는 자리를 배치합니다.");

        boolean isRealloc = true;
        int lottoIdx=0;
        int alloCnt=0;

        for(int i=0;i<SELECT;i++){
            while (isRealloc){
                lottoIdx = (int)(Math.random()*TOTAL);
                isRealloc = false;

                for(int j = 0; j<alloCnt; j++){
                    if(selectIdx[j]==lottoIdx){
                        System.out.println("중복발생");
                        isRealloc = true;
                        break;
                    }
                }
            }

            selectIdx[alloCnt++]=lottoIdx;
            isRealloc = true;
                System.out.printf("당첨번호 : %d\n",lottoIdx);
        }

    }
}
