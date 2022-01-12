import java.util.Arrays;

public class DiceManager {

    int diceNum;

    Dice[] diceArr;

    int sum ;

    public DiceManager(int diceNum) {
        sum = 0;
        this.diceNum = diceNum;
        diceArr=new Dice[diceNum];
        //Dice형 객체를 배열로 만들어서 각기 2개의 객체가 생성됨
    }


    public void checkwin(int sum){//짝수면 이김
        if(sum%2==0){
            System.out.println("축하합니다");
        }
        else{
            System.out.println("지옥이닷");
        }

    }
    public void playDiceGame(){
        int tmp;

        for(int i=0;i<diceNum;i++){//객체를 생성자를 통해 만들었다
            diceArr[i]=new Dice(); //주사위 객체 생성// dice생성자를 호출함>>> 랜덤값을 가지고옴
            tmp=diceArr[i].rollDice();
            //다이스의 객체인 배열이 2개가 있다
            // 다이스의 객체가 배열안에 있어서
            // 다른 클래스의 메서드를 호출가능함
            System.out.println(tmp);
            sum+=tmp;

           /*  Dice a = new Dice();
            a.rollDice();  */
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


