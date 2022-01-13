

public class ProBank1_6 {
    public static void main(String[] args) {

      // 6. 주사위 2개를 굴려서 눈금의 합을 출력해봅시다.
      // 7. 주사위를 굴려서 짝수인 경우 당첨입니다! 출력
      // 8. 주사위를 굴려서 홀수가 나오면 손모가지를 내놔라 출력

     //주사위가 추후에는 여러개를 굴릴수도 있음
    // 주사위 배열화

    Dice dice = new Dice();

    dice.rollDice();
    System.out.println(dice);
    dice.checkSum();

    }


}
