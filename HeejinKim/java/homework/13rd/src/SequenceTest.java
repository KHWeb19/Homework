public class SequenceTest {
    static final int EVEN=0;
    static final int ODD=1;

    public static void main(String[] args) {

        SequenceGenerator sg = new SequenceGenerator(1,100);
        sg.creatSequence();
        sg.printCondition(EVEN);
       // sg.printCondition(ODD);

        System.out.printf("1 ~ 100까지 4의 배수 합: %d\n", sg.findAndSum(4));

        sg.printRandomCondition(2,10);

        sg.printRandomTravel(2,10);

        sg.printRandomTimesTravel(2,10);

    }

}
