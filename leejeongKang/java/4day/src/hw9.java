public class hw9 {
    public static void main(String[] args) {
        final int START = 3;
        final int END = 25;

        int [] arr = new int [END];
        int i;
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;

        for (i=3; i<arr.length; i++){
            arr[i]= arr[i-1]+ arr[i-3];
            arr[0]= arr[1];
            arr[1]=arr[2];
            arr[2] =arr[i];
            System.out.printf("%d번째 항 %d\n", i+1, arr[i]);

        }
        System.out.printf("\n\n\n%d번째 항 %d\n", i, arr[24]);

    }
}
