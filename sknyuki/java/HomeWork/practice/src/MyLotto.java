import java.util.Arrays;

public class MyLotto {
    private int peopleNum;
    private int selectNum;
    private final int peopleMin = 1;
    int peopleRange;
    int NumberRange;
    int[] peopleArr;
    int[] selectArr;


    public MyLotto(int peopleNum, int selectNum) {
        this.peopleNum = peopleNum;
        this.selectNum = selectNum;
        peopleArr=new int[peopleNum];
        selectArr=new int[selectNum];
        peopleSelect();
        NumberSelect();
    }
    //중복 체크 메뉴얼
    //for문으로 우선 필요한 갯수만큼 Math.random 루프를 돌림
    //while문 내부에 중복을 체크하기위한 boolean함수를 함수로 만듦
    //boolean함수의 내용
    //루프를 돌린 이전항과 일치하는지 체크
    // 일치->true
    // 불일치->false
    //true일시 break로 for문부터 다시 돌리게끔


    //
    public boolean checkduplicat(int rand, int[] Arr, int cnt) {
        for (int i = 0; i < cnt; i++) {
            if (rand == Arr[i]) {
                return true;
            }
        }
        return false;
    }


    public void peopleSelect() {
        int rand;
        peopleRange = peopleNum - peopleMin + 1;
        for (int i = 0; i < peopleNum; i++) {
            do {
                rand = (int) (Math.random() * peopleRange + peopleMin);
            }while (checkduplicat(rand, peopleArr, i));
                peopleArr[i] = rand;

        }
    }

    public void NumberSelect() {
        int rand;
        NumberRange =peopleNum - peopleMin + 1;
        for (int i = 0; i < selectNum; i++) {
          do {
              rand = (int) (Math.random() * NumberRange);
          }while (checkduplicat(rand, selectArr, i));
                selectArr[i] = rand;
        }
    }
    public void peopleset(){
        for (int i=1;i<peopleNum;i++){
            System.out.printf("%4d", peopleArr[i-1]);

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public void winner(){
        for(int i=0; i<selectNum; i++){
            System.out.println("\n당첨자:"+selectArr[i]);
        }
    }
    @Override
    public String toString() {
        return "MyLotto{" +
                "peopleArr=" + Arrays.toString(peopleArr) +
                ", selectArr=" + Arrays.toString(selectArr) +
                '}';
    }
}
