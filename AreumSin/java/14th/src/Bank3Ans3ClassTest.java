public class Bank3Ans3ClassTest {
    public static void main(String[] args) {
        //3. 배열로 로또 문제를 만들어보기!
        //   실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        // 블라인드 경매
        // 1. 들어오는 사람에게 랜덤으로 번호를 할당해준다.
        // 2. 추첨된 기계가 랜덤으로 번호를 할당한다.
        // 3. 당첨된 사람들을 매칭 시킨다.

        MyLotto myLotto = new MyLotto(100, 5);
        myLotto.allocPeopleNumber();

        myLotto.allocPeopleNumber();
        myLotto.printPeopleArr();

        myLotto.raffle();

        System.out.println("경계선");
        MyLottoRefactor mlr = new MyLottoRefactor(100, 5);
        mlr.raffle2();
    }
}
