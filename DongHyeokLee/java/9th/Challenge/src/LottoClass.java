public class LottoClass {
    public static void main(String[] args) {
        //배열로 로또 문제를 만들어보기!
        // 실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
       // 실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        // 배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        LotteryDraw winning = new LotteryDraw();

        winning.draw();

       //출력 값들이 제대로 나오는지 확인함
        //LottoIdx lo = new LottoIdx();

       // lo.initLottoIdx();

        //PeopleRan pe = new PeopleRan();

        //pe.initRandom();

    }
}
