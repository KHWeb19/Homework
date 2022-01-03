public class Answer3 {
    public static void main(String[] args) {
        //배열로 로또 문제를 만들어보기!
        //   100명 중 5명이 당첨되도록 만들어보자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        final int TOTAL = 100;
        final int SELECT = 5;

        boolean[] lottoBox = new boolean[TOTAL];
        int[] selectIdx = new int[SELECT];

        System.out.println("당첨되는 자리를 배치합니다.");

        //구현 전략
        //1. 전체 100개 배열을 만들어준다.
        //2. 당첨 자리 5개 랜덤하게 할당.
        //3. 할당된 자리 중 중복이 존재할 가능성도 있으므로 검사해야 함.
        //   선택된 인텍스는 0~99사이의 랜덤값임. 그렇다면 어떻게 이 랜덤 인덱스의 중복 여부를 판정할 것인가?
        //   실제 SELECT는 5개 이므로, 이 SELECT를 활용한 5개 배열에 랜덤 인덱스를 배치하면 어떨까?
        //   그럼 최악의 경우를 가정하더라도 최대 4개만 검사하면 된다.

        boolean isRealloc = true;

        int lottoBoxIdx = 0;
        int allocCnt = 0;

        //추가 전략이 필요해짐
        // 1. 전체 루프는 5번이 필요함(총 5개를 중복되지 않게 배치해야 함)
        // 2. 반복 루틴 내에서 랜덤값 할당
        // 3. 중복이 발생했다면 반복 루틴에서 다시 체크 생성하도록 만듬

        for(int i = 0; i < TOTAL; i++){
            lottoBoxIdx = (int)(Math.random() *TOTAL);
            isRealloc = false;

            for(int j = 0; j < SELECT; j++){
                    if(selectIdx[j] == lottoBoxIdx){
                        isRealloc = true;
                        break;
                    }
                }
        }

        lottoBox[lottoBoxIdx] = true;
        selectIdx[allocCnt++] = lottoBoxIdx;

            //이대로 가면 놓치게 되는 것 → 중복을 놓치게 된다.
            //그러므로 중복 발생 여부를 체크하는 루틴이 추가로 필요해짐

        System.out.println("lottoBox[" + lottoBox + "] = " + lottoBox[lottoBoxIdx]);

        }

    }
