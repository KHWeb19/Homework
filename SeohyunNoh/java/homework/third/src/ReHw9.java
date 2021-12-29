public class ReHw9 {
    public static void main(String[] args) {
        /*
        1. 1~100까지 순회하는 for문
        2. 2~10 난수를 생성하고
        3. 난수가 할당이 됐는지 체크하는 boolean
        4. 할당이 됐으면 -> 배수를 출력할 수 있도록
        5. 마지막에 누산
         */

        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MIN = 2;
        final int MAX = 10;
        final int range = MAX - MIN + 1;

        int rand=0;
        boolean isRandomAllocate = false;
        int sum = 0;

        for(int i = START; i <= END ; i++){

            while(!isRandomAllocate){
               rand = (int)(Math.random() * range + MIN);
                isRandomAllocate = true;
            }

            if(i % rand == REMAIN){
                System.out.printf("%d의 배수 i : %d\n", rand, i);
                //왜 if문에서 isRandomAllocate = false; 이걸 하지?
                //배수 만들어주고 sum 만들어주면 되지 할당여부 체크를 왜하지
                isRandomAllocate = false;

                sum += i;
            }
        }
        System.out.println("배수의 총합 : " + sum );
    }
}