public class Ans3 {
    public static void main(String[] args) {
        //배열로 로또 문제를 만들어보기!
        //   실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //   실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자! -> 100분의 5확률
        //   배열값에 당첨되는 자리를 배치해놓고 ---> 이거 랜덤으로 하는건가? 아닌가?
        //   사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        // 1.100길이의 배열 생성
        // 2. 5개의 당첨 자리 생성 -> 랜덤하게 할당
        // + 할당된 수 중복인지 체크하는 것 필요
        // 3. 사용자 뽑기

        //final int START = 0;
        final int SELECT = 5;
        final int TOTAL = 100;

        boolean[] lottoBox = new boolean[TOTAL];
        int[] selectIdx = new int[SELECT];

        boolean isRealloc = true;

        int lottoIdx = 0;
        //int allocCnt = 0;

        for (int i = 0 , allocCnt = 0; i < SELECT; i++) { // 총 다섯개를 뽑아야함
              while(isRealloc){
            lottoIdx = (int) (Math.random() * TOTAL); // 이것을 lottoBox에 넣어야함

             isRealloc = false; //for문 수행 후 while 문을 빠져나가게함

                  for(int j = 0; j < allocCnt; j++){  //첫번째는 중복 값을 구할 필요가없음
                      if(selectIdx[j] == lottoIdx){
                          System.out.println("중복 발생");
                          isRealloc = true; // 중복일시 while문 다시 반복 해서 lottoIdx를 다시 할당
                          break; // for문 벗어나서 while문으로
                      }
                      }
                  }


              lottoBox[lottoIdx] = true; // 당첨 번호
              selectIdx[allocCnt++] = lottoIdx; // 중복 체크하기 위함 최초로 selectIdx[0] = lottoIdx;을 만들어내고 allocCnt를 ++시킴

            System.out.println("lottoBox[" + lottoIdx + "] =" + lottoBox[lottoIdx]);

            isRealloc = true; // 당첨번호 할당후 for문을 거쳐 다시 whlie문 반복









        }



    }
}
