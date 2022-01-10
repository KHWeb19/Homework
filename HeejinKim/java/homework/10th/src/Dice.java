public class Dice {

    final int MAX=6;
    final int MIN=1;
    //final int diceNum=2;
    int range;
    int sum=0;
    int dice=0;
  //Dice형태의 배열 2개를 만든다 diceArr= new
    //for문 안에서 배열이 생성됨

    public Dice (){//생성자를 이용해서 초기화

        range= MAX+MIN-1;
    }

    public int rollDice(){

        return (int)(Math.random()*range+MIN);
    }



}
