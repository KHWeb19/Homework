public class Homework9 {
    public static void main(String[] args) {
        //원래 있던 코드에서 first~ 부터 end 까지 배열로 집어 넣어 줘야 하는데

        int [] arr = new int[8];
         arr[1] = 1;
         arr[2] = 1;
         arr[3] = 1;
         arr[4] = 2;
        int result = 0, i;

        arr[4] = 4;
        arr[5] = 20;

        // 컴퓨터에서 배열의 시작이 0이기 때문에
        // 반복 시작을 0을 기준으로 맞춰주는 것이 좋습니다.
        // 그래서 START 2는 결국 3번째
        for (i =  arr[4]; i < arr[5]; i++) {
            result = arr[1] +  arr[2] + arr[3];
            arr[1] = arr[2];
            arr[2] = arr[3];
            arr[3] = arr[4];
            arr[4] = result;

            // 전체 뿌리기
            System.out.printf("%d번째 항 %d\n", i + 1, result);
        }

        System.out.printf("%d번째 항 %d\n", i, result);
    }
}
