public class HW01 {
    // 1. 2 by 2 이중 배열을 초기화해서 아무 값이나 넣어보세요.
    //[출처] 문제 은행 [ 4 ] (에디로봇아카데미) | 작성자 링크쌤

    public static void main(String[] args) {
        String[][] multiArray = new String[2][2];

        final int rowLength = multiArray.length;
        final int columnLength = multiArray[0].length;

        for (int i = 0; i < rowLength; i++) {
            for (int j=0; j < columnLength; j++){
                multiArray[i][j] = "multiArray["+i+"]"+"["+j+"]";

                //2. 1번 문제에서 초기화한 배열을 출력해봅시다.
                //[출처] 문제 은행 [ 4 ] (에디로봇아카데미) | 작성자 링크쌤
                System.out.println(multiArray[i][j]);
            }
        }
    }
}
