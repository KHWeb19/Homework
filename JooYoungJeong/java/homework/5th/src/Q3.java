public class Q3 {
    public static void main(String[] args) {

        // 배열로 로또 문제를 만들어보기!
        // 실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        // 배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        final int MAX = 100;
        final int MIN = 0;
        int RANGE = MAX - MIN +1;

        int [] arr = new int[RANGE];
        for (int i =0; i< 5; i++);{

            int random = (int) (Math.random() * RANGE + MIN);
            arr[random] = random;}

        int random = (int) (Math.random()* RANGE + MIN);
        if (arr[random] == random) {

            System.out.printf("%d는 당첨\n",random);
        }
    }
}
