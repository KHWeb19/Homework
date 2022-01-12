public class ArrayTest {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] arr = new int[100];

        //배열을 만드는 방법
        //1. 데이터 타입 입력
        //2. []대괄호 사용
        //3. 배열의 변수이름으로 사용할 이름 입력
        //4. 메모리 공간 할당
        //4-1. new를 적는다
        //4-2. 할당하고자 하는 메모리 데이터 타입을 입력
        //4-3. 할당할 개수를 [] 대활호 내부에 입력

        //배열은 for 문과 궁합이 좋다.


        for(int i =0;i<MAX;i++){
            arr[i] = i+1;
            System.out.printf("arr[%d]=%d\n,i,arr[i]");
        }

    }
}
