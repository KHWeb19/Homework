public class LottoClass {
    public static void main(String[] args) {
        // 출력되야 하는거
        // 결과

        Lotto lotto = new Lotto(); // 객체 생성

        lotto.init_random();
        lotto.pickNum();

        for(int i =0; i < lotto.PICK; i++) {
            System.out.println(lotto.init_random());
        }
        // 결과가 배열이 나와야하는데..
        // 여기서 scanner을 사용하지않으면 굳이 메서드를 나누는건....


    }
}
