public class HW9 {
    public static void main(String[] args) {
        /*1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자 .... 배열 사용 */
        //1. 배열 25개를 만들어야함
        //2. 식을 구함
        final int NUM = 25;
        int [] arr= new int[NUM];

        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
       // arr[3]=2;


        for(int i=3; i<NUM; i++){

            arr[i]=arr[i-1]+arr[i-3];
            System.out.printf("arr[%d]= %d\n",i,arr[i]);

        }

    }
}
