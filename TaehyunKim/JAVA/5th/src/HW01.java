public class HW01 {
    // 등비수열 1,2,4,8,16.32.64.128.256.512.1024 ... 의 수열에서
    // 사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자
    // 1~32 혹은 31번까지만 올바른 결과가 나온다

    public static void main(String[] args) {

        final int MAX=  32;

        int[] myInt = new int[MAX];

        for (int i=0; i<MAX; i++){
            myInt[i] = (int) Math.pow(2, i);
            System.out.printf("배열 %d의 값: %d\n", i, myInt[i]);
        }
    }

}
