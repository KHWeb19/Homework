public class test6 {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);

        int res =dice1 + dice2;

        System.out.printf("%d + %d = %d\n", dice1, dice2, res);

        /*
        system.out.println("%d + %d = %d\n", dice1, dice2, res);
        sout으로 에러가나서 ln을 f로 바꾸니 실행이됬습니다.
        1. System.out.printf
        2. System.out.println
        Q1. 1번가 2번의 차이점과 어디서 사용하는지
        */
    }
}
