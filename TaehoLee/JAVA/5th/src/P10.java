public class P10 {
    //10. 2개의 배열을 만든다.
    //하나는 과일을 담는 장바구니 배열
    //하나는 해당 과일의 개수가 들어있는 배열이다.
    //사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
    //적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.
    public static void main(String[] args) {
        final int MAX = 10;
        final int MIN = 1;
        int range = MAX - MIN + 1;

        final int COUNT = 6;
        int sum = 0;

        int[] arr1 = new int[COUNT]; // 장바구니 배열
        int[] arr2 = new int[COUNT]; // 과일의 개수가 들어있는 배열

        arr2[0] = 5; // 숫자 입력
        arr2[1] = 3;
        arr2[2] = 5;
        arr2[3] = 2;
        arr2[4] = 3;
        arr2[5] = 4;

        for(int i = 0; i < COUNT; i++){
            int rand = ((int)(Math.random() * range )+ MIN) * 1000;
            arr1[i] = rand;
            sum += arr1[i] * arr2[i];
        }
        System.out.println("과일의 합산 가격 = " + sum);

    }
}
