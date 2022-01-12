public class LottoTest {

    public static void main(String[] args) {


        MyLotto myLotto = new MyLotto(100, 5);
        myLotto.allocPeopleNumber();
        myLotto.printPeopleArr();

        myLotto.raffle();

        System.out.println("===================");

        MyLottoRefactor mlr=new MyLottoRefactor(100,5);
        mlr.raffle2();
    }
}
