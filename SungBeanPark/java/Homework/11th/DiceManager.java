import java.util.Arrays;

public class DiceManager {
    int diceNum;                        // 주사위 2개

    Dice[] diceArr;                     // 주사위 개당 값 넣어주고 돌리기 위해 배열 사용
    int sum;                            // 주사위 2개의 합

    public DiceManager(int diceNum){    // 매개변수가 있는 생성자, 창고?역할
        sum = 0;                        // 주사위 눈급의 합
        this.diceNum = diceNum;         // 생성자의 매개변수로 인스턴스변수들의 초기값을 제공받는 경우가 많다.
        // this를 사용해서 구별되도록 하고 this는 참조변수로 인스턴스 자신을 가리킨다.
        // 인스턴스 멤버들만 사용가능하며 static메서드(클래스 메서드)에서는 사용이 불가
        // why? static메서드는 인스턴스를 생성하지 않고도 호출될 수 있으므로 static메서드
        // 호출된 시점에 인스턴스가 좋재하지 않을 수도 있다.
        diceArr = new Dice[diceNum];
    }

    public void checkWin(int sum){      //주사위 합 홀 짝 판별 메서드
        if(sum % 2 == 0) {
            System.out.println("당첩입니다!!");
        }else{
            System.out.println("꽝");
        }
    }

    public void playDiceGame(){                     // 돌려돌려, 주사위합쳐
        int tmp;                                    // 창고역할

        for(int i =0; i < diceNum; i++){            // 주사위 2개 굴려서
            diceArr[i] = new Dice();                // Dice인스턴스를 생성
            tmp = diceArr[i].rollDice();            // diceArr안에 rollDice를 tmp에 넣는다
            System.out.printf("tmp = %d\n", tmp);   // 뽑고
            sum += tmp;                             // sum변수에 += tmp
        }
        checkWin(sum);                              // 확인해봐 승자 checkWin 호출
    }


    @Override    //toString는 인스턴스에 대한 정보를 문자열로 제공할 목적, 호출하면 클래스 이름에 16진수 해시코드 얻음
    public String toString() { // 단축키 alt + Insert, 이클립스 alt + shift + s
        return "DiceManager{" +
                "diceNum=" + diceNum +
                ", diceArr=" + Arrays.toString(diceArr) +
                ", sum=" + sum +
                '}';
    }
}
