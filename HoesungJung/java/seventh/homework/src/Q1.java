public class Q1 {
    public static void main(String[] args) {
        int [][] arr = new int [2][2];
        final int MAX = 2;
        for(int i = 1;i<2;i++){
            for(int j = 1;j<2;j++){
                arr[i][j] = j+1;
                System.out.println(arr[i][j]);
            }
        }
    }
}
