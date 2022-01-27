import java.util.Arrays;

public class Homework03 {
    public static void main(String[] args) {
//       [배열로 로또 문제를 만들어보기!]
//       100명 중 5명 당첨
//       배열값에 당첨되는 자리를 배치해놓고
//       사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        final int PLAYER = 100;
        final int SELECT = 5;

        boolean[] lottoBox = new boolean[PLAYER]; // 100명 넣어둘 배열.
        int[] selectIdx = new int[SELECT]; // 당첨 번호를 넣어둘 배열
        boolean isCheck = true;

        int lottoIdx = 0;

        for (int i = 0, allocCnt = 0; i < SELECT; i++){ // 0,1,2,3,4 총5번
            while (isCheck){
                lottoIdx = (int) (Math.random() * PLAYER);
                isCheck = false;
                // 중복 체크하는 과정
                for (int j = 0; j < allocCnt; j++) { // 가장 처음 뽑은 번호는 체크할 필요가 없어서
                    if (selectIdx[j] == lottoIdx) { // 랜덤번호랑 같을때
                        isCheck = true; // while을 다시 반복하기 위해서 변경
                        break; // 루프 벗어남
                    }
                }
            }
            lottoBox[lottoIdx] = true;

            selectIdx[allocCnt] = lottoIdx;
            allocCnt++; //중복 체크 과정 때문에 추가된 코드
            // selectIdx[allocCnt++] = lottoIdx; -> 이렇게 표현할 수도 있음.

            isCheck = true; //while을 다시 반복하기 위해서 변경

//            System.out.println("lottoBox[" + lottoIdx + "] = " + lottoBox[lottoIdx]);
        }

        System.out.println("당첨 번호 : " + Arrays.toString(selectIdx));
    }
}
