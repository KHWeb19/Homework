public class Bank2Ans5to10Test {
    static final int EVEN = 0; // 나머지가 0
    static final int ODD = 1; // 나머지가 1
    public static void main(String[] args) {
        SequenceGenerator1 sg = new SequenceGenerator1(1, 100);
        sg.createSequence();
        System.out.println("짝수");
        sg.printCondition(EVEN);
        System.out.println("홀수");
        sg.printCondition(ODD);

        System.out.println("4의 배수 합: "+sg.findAndSum(4));

        System.out.println("2 ~10 중 랜덤으로 뽑아 배수를 구합니다!");
        sg.printRandomCondition(2, 10);

        // 10번 문제
        // 1~100을 순회함.
        // 2 ~10 사이의 랜덤값을 매번 변경함.
        // 랜덤한 숫자만큼 이동을 함.

        System.out.println("랜덤 숫자만큼 이동");
        sg.printRandomTravel(2, 10);

        // 9번 문제
        // 1~100을 순회함.
        // 2 ~10 사이의 랜덤값을 매번 변경함.
        // 랜덤 뽑은 근저리의 배수를 출력해야함함.
        System.out.println("근처 배수를 출력 ");
        sg.printRandomTimesTravel(2, 10);

    }
}
