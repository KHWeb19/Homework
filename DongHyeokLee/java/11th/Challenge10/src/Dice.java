public class Dice {

    //플레이어들이 주사위를 굴림
    // 합계가 나오고
    // 짝수 홀수냐
    // 짝수면 스폐셜 주사위를 굴려야함
    // 합계도 여기서 처리해야되나??
    //더 크게 먼저 클래스를 나누는 와꾸부터 잡아야할듯

    final int MAX = 6;
    final int MIN = 1;

    int range = MAX - MIN + 1;;

    int[] dice;
    int sum;
    int diceCnt , specialDice;

    //생성자는 초기화
    public Dice(final int diceCnt) {
        for (int i = 0; i < diceCnt; i++) {
            dice = new int[diceCnt];

            //dice[i] = (int) (Math.random() * range + MIN);

        }
    }

    public void rollDice() {
        for (int i = 0; i < diceCnt; i++) {
            dice[i] = (int) (Math.random() * range + MIN);

            sum += dice[i];
        }
    }

    // 돌렸으면
    // 효과발동해야함
    public int specialDice(){
        return (int) (Math.random() * range + MIN);
    }

    public boolean checkSum(){
        if(sum % 2 == 0 ){
            return true;
        }else{
            return false;
        }
    }

    public void operateDice(int num){
        sum += num;

        if (sum < 0) {
            sum = 0;
        }
    }

}





