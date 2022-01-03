public class ArrayTest {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] arr = new int[100];

        //배열 생성 방법.
        // 1. 데이터 타입을 적는다.
        // 2. [] 중괄호를 열고 닫느다.
        // 3. 배열의 변수 이름으로 사용할 이름을 적는다.
        // 4. 메모리 공간을 할당해준다.
            // 4-1. new를 적는다.
            // 4-2. 할당하고자 하는 메모리 데잍 타입을 적는다.
            // 4-3. 할당할 개수를 [] 중괄호 내부에 적어준다.

        // 배열은 for문과 궁합이 아주 좋다.
        for (int i = 0; i < MAX; i++){
            arr[i] = i+1;
            System.out.printf("arr[%d] = %d\n",i,arr[i]);
        }


    }
}
