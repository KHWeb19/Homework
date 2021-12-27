public class Q9 {
    public static void main(String[] args) {

        //1~100 범위 지정
        final int start = 1;
        final int end = 100;
        final int remain = 0;

        //2~10 사이 난수 범위 지정
        final int min = 2;
        final int max = 10;
        int range = max-min+1;

        //합 초기화
        int sum = 0;

        //루프 생성
        boolean isTrue = false;
        //난수 초기화
        int decision = 0;


        //1~100 순회
            for(int i = start;i<end;i++){
                while(!isTrue){
                    //난수 생성
                    decision = (int)(Math.random()*range+min);
                    isTrue = true;
            }
                //배수의 조건 생성
                if(i%decision==remain){
                    System.out.printf("%d\n의 배수 i= %d\n",decision,i);
                    isTrue = false;

                    //배수의 합 설정
                    sum += i;
                }
        }
        System.out.println("수의 합:"+sum);

    }
}
