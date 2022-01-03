public class ArrayTest {
    public static void main(String[] args) {
        /*
        배열 만들기
        1. 데이터타입 적기 --> int
        2. [] 입력
        3. 배열의 변수명 지정 --> arr
        4. 메모리 공간을 할당해준다
        4-1. new 적고
        4-2. 할당하고자 하는 데이터타입 동일하게 적고 --> int
        4-3. []안에 할당할 개수 입력 --> [MAX] 즉, 100개를 할당할 거임
         */
        final int MAX = 100;
        int[] arr = new int[MAX];

        // 아래의 i=0이란 arr[0]을 나타냄
        // i = 0 부터 들어오고
        // arr[0] = 1 이 됨
        // 그 후에 i가 증감되어 i = 1이 들어가고
        // arr[1] = 2 가 됨
        for(int i = 0; i < MAX; i++){
            arr[i] = i + 1;
            System.out.printf("arr[%d] = %d\n",i, arr[i]);
        }
    }
}
