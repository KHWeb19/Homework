public class M9 {
    public static void main(String[] args) {


        /*  1 ~ 100까지의 숫자를 순회한다.
            2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
            다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다. */


        // 1. 1 ~ 100까지 숫자 순회는 for문을 사용
        // 2. for 문 내부에서 랜덤 난수 생성 2 ~ 10
        // 3. 난수의 배수를 검사하기 전까지 랜덤을 다시 생성하면 안됨(while 문 인용)

        // 실제 난수의 할당(생성) 했는지 안했는지 판정

        final int EVEN = 0;
        final int ODD = 1;


            M9Class sg = new M9Class(1, 100);
            sg.createSequence();

            sg.printCondition(EVEN);
            sg.printCondition(ODD);

            System.out.printf("1 ~ 100까지 4의 배수 합: %d\n", sg.findAndSum(4));

            sg.printRandomCondition(2, 10);

            // 일단 1 ~ 100을 순회함
            // 2 ~ 10사이의 랜덤값을 매번 변경함
            // 랜덤한 숫자만큼 이동을 함
            sg.printRandomTravel(2, 10);

            // 일단 1 ~ 100을 순회함
            // 2 ~ 10사이의 랜덤값을 매번 변경함
            // 랜덤 뽑은 근저리의 배수를 출력해야함
            sg.printRandomTimesTravel(2, 10);
        }
    }