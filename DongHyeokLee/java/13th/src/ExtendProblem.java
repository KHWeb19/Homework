public class ExtendProblem {
    public static void main(String[] args) {

        DiceGame dg = new DiceGame();

        dg.startGame();
        System.out.println(dg);

        dg.printResult();
    }
}

        //* 엔티티 오염도를 낮추기 위한 분리의 필요성 측면의 분석
            // 일단 생각지도 못한건 DICE 클래스에서 주사위를 온전히 주사위로써의 기능만 하도록 남겨놓았다.
            // 나는 주사위에서 주사위에서 나온 값과 그 합을 모두 처리 하려다보니 어려워졌었다.
            // 그 다음은 각자 플레이어가 주사위를 굴리는 행위를 Player 클래스에 구현하였고
            // 그 다음 플레이어가 주사위를 굴리고 나서 나오는 추가적인 스킬들을 또 GameManager 클래스에 구현하였다
            // 내가 생각하기에는 이렇게 기능마다 각 클래스로 분리 함으로써
            // 만약에 플레이어가 추가되거나 스킬들이 더 추가 됐을경우 혹은 주사위가 추가 됐을경우에
            // 각 기능이 작동하는 곳에 가서 그것만 변경하면 되서 추후에 엔티티 오염도를 낮출 수 있는게 아닌가 싶다.

        //* 결합이 많이 되면 리팩토링(코드 개선)시 왜 힘든지에 대한 분석
           // -->> DiceGame.applySkillEffect();로 이동

        // * 새로운 기능이 추가될 때 잘못된 설계가 주는 악영향이 무엇인지 차원에서 살펴보면 도움이 될 것 같습니다.
             // -->> Player.checkSpecial();로 이동