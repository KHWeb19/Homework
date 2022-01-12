public class Q8 {
    public static void main(String[] args) {
        //1~100까지 숫자 순회
        //2~10 사이의 랜덤한 숫자 선택, 숫자의 배수 출력

        //1~100 범위 지정
        final int start = 1;
        final int end = 100;
        final int remain = 0;

        //2~10 사이 난수 범위 지정
        final int min = 2;
        final int max = 10;
        int range = max-min+1;

        //루프 생성
        boolean isFalse = false;

        //난수 초기화
        int decision = 0;

        //1~100 순회
        for (int i= start;i<end;i++){
            while(!isFalse){
                //난수 생성
                decision = (int)(Math.random()*range+min);
                isFalse = true;
            }
            //배수의 조건 생성
            if(i%decision == remain){
                System.out.printf("%d\n의 배수 i = %d\n",decision,i);
                isFalse = false;


            }
            }
        }
        }



