public class Dice {     //주사위 만들기용 클래스
    final int MAX = 6;
    final int MIN = 1;

    int range;

    public Dice(){     // Dice 생성자
        //1. 생성자는 클래스와 이름이 같아야 한다.
        //2. 모든 클래스에는 반드시 생성자 1개 이상 가져야 한다.
        //3. return값이 없으므로 void는 생략
        System.out.println("나는 DICE 클래스의 기본 생성자!");
        range = MAX - MIN + 1;
    }

    // 메서드
    public int rollDice(){
        return(int)(Math.random() * range + MIN);
    }
}
