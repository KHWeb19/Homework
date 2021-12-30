public class Hw3 {
    public static void main(String[] args) {
        //배열로 로또 문제를 만들어보기!
        //실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        //배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        // 배열 100개를 이용하여 전체 100개의 자리를 설정
        // (0~99)까지의 랜덤 숫자를 이용하여 5개의 당첨 자리를 선택
        // 당첨 자리를 5번 뽑으면서 중복 자리가 나올 수 있으니
        // 이 전에 뽑았던 당첨 자리와 지금 뽑았던 당첨 자리가 중복이 되면 당첨 자리를 재할당


        final int TOTAL = 100;   //총 100개의 자리 중
        final int SELECT = 5;    //5개의 당첨 자리 선택

        boolean[] lottoBox = new boolean[TOTAL];  //전체 자리 지정
        int[] selectIdx = new int[SELECT];  // 당첨 선택된 자리 지정

        boolean isRealloc = true; //재할당을 참으로 지정

        int lottoIdx = 0; //할당될 로또 당첨 자리 초기화
        int allocCnt = 0;  //할당될 로또 자리 횟수 초기화

        //while (isRealloc){
        for(int i = 0; i < SELECT; i++){ // 5개 당첨 자리 배치
            while (isRealloc){
                lottoIdx = (int)(Math.random()* TOTAL ); // 배열 자리 할당이므로 0 ~ 99까지 중 당첨 자리 배치

                isRealloc = false;// 자리를 막 할당 받았으므로 와일 구문을 거짓으로 지정

                for (int j =0; j < allocCnt; j++){  //5번 배치되어야 하므로 제대로 당첨 자리가 배치될 때마다 카운트 횟 수 1증가
                    if (selectIdx[j] == lottoIdx){ //당첨 자리가 이 전에 할당된 당첨 자리면....
                        System.out.println("당첨 자리를 재할당합니다!");
                        isRealloc = true; //중복이 발생하였으므로 와일 구문을 재실행
                        break;
                    }
                }
            }
            lottoBox[lottoIdx] = true;  //당첨 자리를 참으로 설정
            selectIdx[allocCnt++] = lottoIdx;  // 0부터 1씩 올라가며 할당된 당첨 자리 횟수가 5까지 올라간다.

            System.out.println("lottoBox["+lottoIdx+"] = "  + lottoBox[lottoIdx]);

                    isRealloc = true;
        }
    }


}


