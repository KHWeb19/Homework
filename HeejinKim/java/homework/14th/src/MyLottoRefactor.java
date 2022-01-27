public class MyLottoRefactor {

    int totalNum;
    int selectNum;

    int max;
    final int MIN = 1;
    int range;
    int[] peopleArr;
    int[] selectArr;

    public MyLottoRefactor(final int totalNum, final int selectNum) {
        this.totalNum = totalNum;
        this.selectNum = selectNum;

        max = totalNum;
        range = max - MIN + 1;

        peopleArr = new int[totalNum];  //중복이 되면 안됨됨
        selectArr = new int[selectNum];// 당첨번호가 적혀진 배열
    }

    public boolean isDuplicate(int rand, int[] arr, int cnt) {
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == rand) {
                return true;
            }
        }
        return false;
    }

    public void allocPeopleNumber() {
        int rand;

        for (int i = 0; i < totalNum; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (isDuplicate(rand, peopleArr, i)); //사람에 대한 것이라 i를 사용하고
                                                        //i값이 2면 2개를 검사하면됨
            peopleArr[i] = rand;
        }
    }

    public void allocSelectNumber() {
        int rand;

        for (int i = 0; i < selectNum; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (isDuplicate(rand, selectArr, i));
            selectArr[i] = rand;
        }
    }
    public void allocNonDuplicateArrNumber(final int cnt,int []arr) {
        int rand;

        for (int i = 0; i < cnt; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (isDuplicate(rand, arr, i));

            arr[i] = rand;
        }
    }

    public void checkWinner() {
        for (int i = 0; i < selectNum; i++) {
            for (int j = 0; j < totalNum; j++) {

                if (selectArr[i] == peopleArr[j]) {
                    System.out.printf("자리 :%2d 당첨\n", j);//사람의 위치 자리를 나타낼때 j를 사용함
                }
            }
        }
    }

        public void raffle () {
            allocSelectNumber(); //selectArr[i]가 당첨번호를 저장해 놓고 있음
            checkWinner();
        }
        public void raffle2(){
        allocNonDuplicateArrNumber(totalNum,peopleArr);
        allocNonDuplicateArrNumber(selectNum,selectArr);
        checkWinner();

        }


        public void printPeopleArr () {

            for (int i = 1; i <= totalNum; i++) {
                System.out.printf("%4d", peopleArr[i - 1]);

                if (i % 10 == 0) {
                    System.out.println();//10번째에서 띄어쓰기
                }
            }
        }
    }

