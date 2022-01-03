public class Practice6_1 {
    public static void main(String[] args) {
        final int NUM = 12345;
        int num1 = 0;
        int[] arr = new int[5];


        for(int i = 0; i < NUM+1; i++){
            arr[i] = NUM / 10;// 여기에 NUM의 숫자 중에서 내가 원하는 자리 숫자가 출력되게 하고
                       //NUM의 숫자를...나누기를 해줘서 내가 원하는 자릿수만 출력되도록 하나?
                       //근데 이게...배열마다 다른 수랑 나눠져야 하잖아
                       //final NUM이면 int처럼 임의로 수가 변하지 않으니까 반복할 때마다 숫자가 12345로 초기화되나?
                       //그래도 단순 반복으론 안되는데 나눌 값이 10 >100 >1000 >10000 으로 점점 커지게 할 방법이 뭐지?ㅠ
            num1 = arr[i];

            //NUM의 앞자리를 출력한 다음에
            System.out.printf("arr[%d] = %d\n", i, NUM%10 );

            //반복되면 NUM의 앞자리가 변환될 수 있도록...뭔가 조치를 취해줘야 하는데
            //아 진짜 방법을 모르겠네...

            }

    }
}
