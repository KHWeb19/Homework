public class Q10 {
    public static void main(String[] args) {
        //1~100 범위 지정
        final int start = 1;
        final int end = 100;

        //2~10 사이 난수 범위 지정
        final int min = 2;
        final int max = 10;
        int range = max - min + 1;

       //난수 생성
        int decision = 0;

        //합 초기화
        int sum = 0;

        //1~100 순회
        for (int i = start; i <= end; i += decision) {
            //난수 생성
            decision = (int) (Math.random() * range + min);
            //이동 위치 출력
            System.out.printf("난수 = %d, 이동 위치=%d\n",decision,i);

            //합 설정
            sum += i;
        }
        System.out.println("합: "+sum);
    }
}
