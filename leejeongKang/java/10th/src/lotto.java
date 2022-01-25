public class lotto {

    final int peopleNum =100;
    final int selectNum = 5;
    int range = selectNum;
    int [] people = new int[peopleNum];
    int [] select = new int [selectNum];

    public void Random (int num, int[] arr) {
        int rand = (int)(Math.random()*range);
        for (int i =0; i<num; i ++){
            arr[i] = rand;

        }

    }

    public void lottoCheck () {

    }


}
