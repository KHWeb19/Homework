public class Ans3 {
    public static void main(String[] args) {
       ////로또는 확률이 골빠게지니까 임의로 0~100까지로 범위 설정
        final int TOTAL = 100;
        ////로또니까 5자리 나와야됨.
        final int SELECT = 5;
        ////TOTAL을 lottobox 라는 논리형 변수의 배열 객체로 만듦.
        boolean[] lottoBox = new boolean[TOTAL];
        ////SELECT를 selectIdx 라는 정수형 변수의 배열 객체로 만듦.
        int[] selectIdx = new int[SELECT];
        ////스캐너로 입력받을 것에 대한 정보(?)
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

        ////while문 사용을 위해 논리형 변수 생성
        boolean isRealloc = true;
        ////lottoIdx를 0으로 초기화
        int lottoIdx = 0;

        // for의 초기화란 이와 같은 의미를 가지고 있음
        // 밖에다가 변수 적거나 혹은 for 내부에 초기화 루틴에 적거나 상관없음
        // 다만 내부에 적으면 for 문이 끝날때 소멸함

        //임의의 정수 i와 alloCnt를 생성해 0으로 초기화,
        //i가 SELECT보다 작아야 하고,
        ////한 번 출력후 1씩 증가되어 출력
        for (int i = 0, allocCnt = 0; i < SELECT; i++) {      // 총 5개 배치
           ////루프 생성
            while (isRealloc) {
                ////LottoIdx 를 TOTAL 범위 내에 있는 정수로 만듦.
                lottoIdx = (int) (Math.random() * TOTAL);
                ////나온 수가 모두 같지 않다면 SELECT 값까지 출력
                isRealloc = false;
                ////임의의 정수 j를 0으로 초기화,
                ////j가 alloCnt보다 작아야 하고,
                ////한 번 출력 후 1씩 증가되어 출력
                for (int j = 0; j < allocCnt; j++) {
                    ////조건 생성
                    ////selectIdx의 J번째 배열이 LottoIdx와 같으면
                    if (selectIdx[j] == lottoIdx) {
                        ////"중복 발생!"이라고 출력
                        System.out.println("중복 발생!");
                        ////나온 수가 같으므로 break(처음으로 돌아가서 중복이 없는 동안 SELECT 값까지 다시 출력.)
                        isRealloc = true;
                        break;
                    }
                }
            }
            ////이 부분은 왜 필요한지 이해를 못함.
            lottoBox[lottoIdx] = true;
            selectIdx[allocCnt++] = lottoIdx;

            // 이대로 가면 무엇을 놓치게 될까 ? 중복을 놓치게됨
            // 그러므로 중복 발생 여부를 체크하는 루틴이 추가로 필요해짐!

            System.out.println("lottoBox[" + lottoIdx + "] = " + lottoBox[lottoIdx]);
            ////이 부분 또한 이해를 못함.
            isRealloc = true;
        }
    }
}
