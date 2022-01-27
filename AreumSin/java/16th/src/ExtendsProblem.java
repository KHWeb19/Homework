public class ExtendsProblem {
    public static void main(String[] args) {
        // 주사위 게임 만들었던 내용에 상속을 도입

        // 주사위.. 주사위.. 뭘 상속 받아야할까..
        // 주사위 돌리는걸 상속받아야겠지..


        // 1. GameManager을 만들어야함
        //    게임 전체를 관리
        // 2. 여기서 상속을 활용한다면 기존 구조의 변경이 필요해짐.
        // 3. 현재 구조에서 문제가 되는것은
        //    GameManager가 게임 저체를 관리한다는것
        //    전체를 관리하는게 문제
        // 4. GameManager가 전체가 아니라 player 개인에게 집중하는 구조라면
        // 5. 이 구조가 된다면 gameManager에게 player을 상속할 수 있게 된다.

        // 전체를 관리한다 <<--- player가 상속됨
        // gameManager는 player 1명을 관리하고 있음
        // 전체를 관리한다면서..?
        /* 필요에 의해 DiceGame으로 옮겨서 한 층 더 추상화시킴
        final int PLAYER_NUM = 2;
        final int DICE_NUM = 2;
        // 현재 구조대로라면 GameManager는 선수 한명을 전담 관리하는 매니저 역할임
        // 그러므로 선수의 숫자만큼 Manager가 만들어져야함
        GameManager[] gmArr = new GameManager[PLAYER_NUM];

        // 아래 루프를 통해 사용자는 주사위 2개를 모두 굴렸고
        // 필요하다면 특수 주사위를 굴리는 작업까지 완료된 상태다.
        // 남은것은 각각의 결과를 적용하고 최종 정산을 하는 작업이다.
        // 그런데 이렇게 해놓고 보니 뭐가 있으면 참 좋겠다는 생각이 들지 않는가 ?
        for (int id = 0; id < PLAYER_NUM; id++) {
            gmArr[id] = new GameManager(id, DICE_NUM);
            gmArr[id].rollEveryDice();
            gmArr[id].checkSpecialDice();
            gmArr[id].rollSpecialDice();
        }
         */

        DiceGame dg = new DiceGame();

        dg.startGame();
        // 현재 모든 내용물을 toString()을 통해 간헐적으로 살펴보고 있음
        // 더 좋은 방법은 없을까 ???
        // 여기에 오늘 학습한 compareTo를 활용해보는 방식은 어떨까 ?
        System.out.println(dg); // toString 나오게

        // 실제로 게임의 승패 판정을 어떻게 할 것인가 ?
        // dg.getResult() 형식으로 처리하면 좋을 것이다.
        // 여기서 주의해야할 사항은 dg 객체 내에는 GameManager 배열이 들어 있다는 것이다.
        // 그러므로 여기서 즉각적인 비교가 가능하다!
        dg.printResult();
    }
}
