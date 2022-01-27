public class Homework9 {
    public static void main(String[] args) {
        //1~100까지 숫자 순회
        // 2~10 사이의 랜덤한 숫자 선택 이 숫자의 배수 출력
        // 다음 루프에서 다시 랜덤 숫자 선택 해당 숫자 배수 출력
        //그 다음 루프에서 다시 작업 반복
        //끝까지 순회 했을때 출력된 숫자들의 합


        final int START = 1, END = 100;
        final int REMAIN = 0;
        final int MAX = 10, MIN = 2;
        int decision = 0;
        int range = MAX - MIN + 1;
        int sum = 0; //초기화 선언 해야함


        // 랜덤 숫자 생성
        // 랜덤 숫자 생성-> 배수 출력 -> 순회 -> 랜덤 숫자 생성
        boolean isRandomAllocCheck = false;
           for(int i = START; i <= END; i++){

                while(!isRandomAllocCheck) {
                    decision = (int) (Math.random() * range + MIN);
                    isRandomAllocCheck = true;//방어루틴
                 }
                 if(i % decision == REMAIN){
                     System.out.printf("%d의 배수 %d\n" , decision, i);
                     isRandomAllocCheck = false;//

                     sum += i;
                 }

        }
        System.out.println("출력된 숫자 들의 합" + sum);
    }
}















