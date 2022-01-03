public class ForInfiniteLoopTest {
    public static void main(String[] args) {

        //초기화, 증감, 조건 모두 없어도 된다.
        // 조건이 없으면 무조건 실행됨 >> 결국 무한 루프
        for(;;){
            System.out.println("Marry Christmas :)");
        }
    }
}
