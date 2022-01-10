public class Lotto {
    final int MAX = 100;
    final int PICK = 5;

    int[] lottoBox = new int[MAX];
    int[] pickBox = new int[PICK];

    int rand;

    public int init_random(){
        rand = (int)(Math.random() * MAX);
        pickNum();
        return rand;
    }

    boolean isCheck = true;
    public void pickNum(){
        for(int i =0; i< PICK; i++) {
            while (isCheck) {

                isCheck = false;

                for (int j = 0; j < PICK; j++) {
                    if (j == rand) {
                        isCheck = true;
                        break;
                    }
                }

            }
            lottoBox[rand] = 7777;
            isCheck = true;

        }
    }
}
