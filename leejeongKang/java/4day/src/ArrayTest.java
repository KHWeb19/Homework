public class ArrayTest {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] arr = new int [MAX];

        //배열 만드는 법
        //1. 데이터 타입을 적는다.
        //2. []
        //3. 배열의 변수 이름으로 사용할 이름을 적는다.
        //4. 메모리 공간을 할당한다
        //4-1. new를 적는다
        //4-2. 할당하고나 하는 메모리 데이터 타입을 적어준다.
        //4-3. 할당할 개수를 [] 대괄호 내부에 적어준다.

        //배열은 for문과 궁합이 아주 좋다.
        // 현재 arr라는 배열은 아래와 같은 형식으로 구한다.

        // [] [] [] [] [] [] [] [] [] [] [] [] [] arr
        //  0  1  2  3  4 5  6  7   8  9  10  11 12

        for (int i=0; i<MAX; i++){
            arr[i] = i + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
