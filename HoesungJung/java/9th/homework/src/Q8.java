public class Q8 {
    public static void main(String[] args) {
        //클래스 불러오기
        Dice dice = new Dice();
        //범위 객체 불러오기
        dice.diceRange();
        //출력
        System.out.printf("주사위 : "+ dice.returnDice());
    }
}
//주사위 클래스 생성
class Dice{
    //최대, 최소 값 설정
    final int MAX=6;
    final int MIN=1;
    //사용할 변수 선언
    int range;
    //범위 객체화
    public void diceRange () {
        range = MAX-MIN+1;
    }
    //결과 객체화
   public int returnDice () {
       return (int) (Math.random()*range+MIN);
    }
}