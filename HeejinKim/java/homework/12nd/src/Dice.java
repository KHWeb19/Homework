public class Dice {//범위를 설정한다
    final int MAX =6;
    final int MIN =1;

    int range;

    public Dice(){//Dice생성자//값을 초기화하는데//범위를 초기화 시켜줌 예를 들어 2
        range=MAX+MIN+1;
    }

    public int rollDice(){
        return (int)(Math.random()*range+MIN);
    }
}
