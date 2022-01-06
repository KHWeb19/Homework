public class MyLottoRefactor {
    int totalNum;
    int selectNum;

    int[] peopleArr;
    int[] selectArr;

    final int MIN =1;
    int max, range;

    public MyLottoRefactor(final int totalNum, final int selectNum){
        this.totalNum = totalNum;
        this.selectNum = selectNum;

        max = totalNum;
        range = max -MIN +1;

        peopleArr = new int[totalNum];
        selectArr = new int[selectNum];
    }

    public boolean isDuplicate(int rand, int[] arr, int cnt){
        for (int i = 0; i < cnt ; i++){
            if(arr[i] == rand){
                return true;
            }
        }
        return false;
    }

    public void allocPeopleNumber(){
        int rand, allocCnt= 0;

        for(int i = 0; i < totalNum; i++){ //100명에게 추천번호를 부여함.
            do{
                rand = (int)(Math.random() * range +MIN);

            }while (isDuplicate(rand, peopleArr, i)); // 겹치지 않을 동안

            peopleArr[i] = rand;
            allocCnt++;
        }
    }

    public void allocNonDuplicateArrNumber(final int cnt, int[] arr){
        int rand;

        for(int i = 0; i < cnt; i++){ //100명에게 추천번호를 부여함.
            do{
                rand = (int)(Math.random() * range +MIN);

            }while (isDuplicate(rand, arr, i)); // 겹치지 않을 동안
            arr[i] = rand;

        }
    }

    public void printPeopleArr(){
        for(int i = 1; i <= totalNum; i++){
            System.out.printf("%4d", peopleArr[i -1]);

            if(i % 10 == 0){
                System.out.println();
            }
        }
    }

    public void allocSelectNumber(){
        int rand;

        for(int i = 0; i < selectNum; i++){ //100명에게 추천번호를 부여함.
            do{
                rand = (int)(Math.random() * range +MIN);

            }while (isDuplicate(rand, selectArr, i)); // 겹치지 않을 동안

            selectArr[i] = rand;
        }
    }

    public void checkWinner(){
        for( int i = 0; i < selectNum; i++ ){
            for(int j = 0;  j < totalNum; j++){
                if(selectArr[i] == peopleArr[j]) {
                    System.out.printf("%d번 당첨: 오늘 밤길 조심하세요! %d \n", j, selectArr[i]);
                    break;
                }
            }
        }
    }

    public void raffle(){
        allocSelectNumber();
        checkWinner();
    }

    public void raffle2(){
        allocNonDuplicateArrNumber(totalNum,peopleArr);
        allocNonDuplicateArrNumber(selectNum,selectArr);
        //allocSelectNumber();
        checkWinner();
    }

}
