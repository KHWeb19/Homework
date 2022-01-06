import java.util.Arrays;

public class DiceManager {

    final int diceNum;

    Dice []diceArr;//주사위 배열을 만든다
    int sum=0;

    public DiceManager(int diceNum){

        this.diceNum=diceNum;

        diceArr=new Dice[diceNum];//Dice형태의 데이터타입을 배열에 넣는다
        //클래스를 객체화
    }

    public void playDice(){
       int tmp;
        for(int i=0;i<diceNum;i++){
            //for문 안에서 배열이 생성됨

            diceArr[i]=new Dice();
            //실제 생성자를 호출한 시점
             tmp=diceArr[i].rollDice();

            System.out.printf("tmp=%d\n",tmp);
            sum+=tmp;
        }

    }

    @Override
    public String toString() {
        return "DiceManager{" +
                "diceNum=" + diceNum +
                ", diceArr=" + Arrays.toString(diceArr) +
                ", sum=" + sum +
                '}';
    }
}
