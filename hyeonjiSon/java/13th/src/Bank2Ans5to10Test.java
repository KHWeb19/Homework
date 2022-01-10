public class Bank2Ans5to10Test {

    static final int EVEN = 2;
    static final int ODD = 1;

    public static void main(String[] args) {
        SequanceGenerator sg = new SequanceGenerator(1, 100);
        sg.createSequence();

        sg.printCondition(EVEN);
        sg.printCondition(ODD);

        System.out.printf("1~100까지 4의 배수의 합: %d\n", sg.findAndSum(4));

        sg.printRandomCondition(2, 10);


//일단 1~100을 순회함
//2~10사이의 랜덤값을 매번 변경함
//랜덤한 숫자만큼 이동을 함
        sg.printRandomTravel(2, 10);

        //일단 1 ~ 100을 순회함
        //2~10사이의 랜덤값을 매번 변경함
        //랜덤 뽑은 근처 자리수를

    }
}

