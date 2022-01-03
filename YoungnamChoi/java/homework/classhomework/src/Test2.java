import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        //2. 1번 문제에서 초기화한 배열을 출력해봅시다.
        int[][] arr = {{1,2,3} ,{4,5,6,}};
        System.out.println(Arrays.deepToString(arr));
        //배열을 그냥 출력하거나 tostring으로 출력을 하면 지정된 값이 출력되는 것이 아니라
        //주소 값이 나오기 때문에 deepToString로 출력을 함

        for(int i=0; i<arr.length; i++){
            int[] inArry = arr[i];
            for(int j=0; j<inArry.length; j++){
                System.out.print(inArry[j] + " ");

            }
            System.out.println();
        }

    }
}
