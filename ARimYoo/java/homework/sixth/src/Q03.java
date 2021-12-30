public class Q03 {
    public static void main(String[] args) {

        final int TOTAL = 100;
        final int SELECT = 5;

        boolean [] lotto = new boolean[TOTAL];
        // 1부터 100까지의 숫자중 참 거짓을 넣는 배열
        int [] select = new int[SELECT];

        System.out.println("당첨되는 자리를 배치합니다.");

        // 1. 랜덤하게 5개 자리를 할당 (참일 경우 당첨)
        // 2. 랜덤값이 중복될 수도 있으므로 .... 검사필요
        //  --> 어떻게 검사하지 ? SELECT = 0 1 2 3 4 여기에 당첨 숫자가 할당된다고 하면 ..

        boolean isRealloc = true;
        int lottoIdx = 0;

        for (int i = 0, allocCnt = 0; i < SELECT; i++){ // 5번 돈다

            while(isRealloc){
                lottoIdx = (int)(Math.random() * TOTAL); // 로또 첫번째 값

                isRealloc = false;

                for (int j = 0; j < allocCnt; j++){
                    if(select[j] == lottoIdx){
                        System.out.println("중복발생!");
                        isRealloc = true;
                        break;
                    }

                }
            }

            lotto[lottoIdx] = true;
            select[allocCnt++] = lottoIdx;  // i가 아니라 왜 allocCnt값이지 ?

            System.out.println("lotto[" + lottoIdx + "] = " + lotto[lottoIdx]);

            isRealloc = true;
        }

    }
}
