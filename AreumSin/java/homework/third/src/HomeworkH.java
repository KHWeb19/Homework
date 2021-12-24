public class HomeworkH {
    public static void main(String[] args) {
        //9. 1 ~ 100까지의 숫자를 순회한다.
        //    2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        //    다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        //    그 다음 루프에서 다시 작업을 반복한다.
        //    끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ?

        /*
        // 내가 해석하고 문제를 푼 결과물... 참담 그자체..
        int res = 0;
        for(int i = 0; i<101; i++){
            //int num1 = (int)(Math.random()*9 +2);
            int num1 = (int)(Math.random()*5 +2);

            if(num1 == 2){
                for(int j = 1; j<21; j++){
                    if(j % 2 == 0){
                        System.out.println("2의 배수: "+j);
                        res += j;
                    }
                }
            }else if(num1 ==3){
                for(int j = 1; j<21; j++) {
                    if (j % 3 == 0) {
                        System.out.println("3의 배수: " + j);
                        res += j;
                    }
                }
            }else if(num1 ==4){
                for(int j = 1; j<21; j++) {
                    if (j % 3 == 0) {
                        System.out.println("4의 배수: " + j);
                        res += j;
                    }
                }
            }else if(num1 ==5){
                for(int j = 1; j<21; j++) {
                    if (j % 3 == 0) {
                        System.out.println("5의 배수: " + j);
                        res += j;
                    }
                }
            }else if(num1 ==6){
                for(int j = 1; j<21; j++) {
                    if (j % 3 == 0) {
                        System.out.println("6의 배수: " + j);
                        res += j;
                    }
                }
            }else if(num1 ==7){
                for(int j = 1; j<21; j++) {
                    if (j % 3 == 0) {
                        System.out.println("7의 배수: " + j);
                        res += j;
                    }
                }
            }else if(num1 ==8){
                for(int j = 1; j<21; j++) {
                    if (j % 3 == 0) {
                        System.out.println("8의 배수: " + j);
                        res += j;
                    }
                }
            }else if(num1 ==9){
                for(int j = 1; j<21; j++) {
                    if (j % 3 == 0) {
                        System.out.println("9의 배수: " + j);
                        res += j;
                    }
                }
            }

            System.out.println("");
        }

        System.out.println(res);
         */

        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        /*  1 ~ 100까지의 숫자를 순회한다.
            2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
            다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다. */

        // 구현 전략이 필요함
        // 1. 1 ~ 100까지 숫자 순회는 for문을 사용
        // 2. for 문 내부에서 랜덤 난수 생성 2 ~ 10
        // 3. 난수의 배수를 검사하기 전까지 랜덤을 다시 생성하면 안됨

        // 실제 난수의 할당(생성) 했는지 안했는지 판정 여부
        boolean isRandomAllocCheck = false;
        int decision = 0;
        int sum = 0;

        for (int i = START; i <= END; i++) { //1~100

            // i는 1일때
            while (!isRandomAllocCheck) { // true일 동안 계속 진행할거야!
                decision = (int) (Math.random() * range + MIN); // 2~10까지 난수 생성
                isRandomAllocCheck = true; // 난수 생성해도 true
            }
            /*
             decision은 7 , i는 계속 증가
             1 % 7 == 0 (x)
             2 % 7 == 0 (x)
             3 % 7 == 0 (x)
             4 % 7 == 0 (x)
             5 % 7 == 0 (x)
             6 % 7 == 0 (x)
             7 % 7 == 0 (o) --> if문으로 들어감.

             처음으로 나온 숫자가 7
             _______________________________
             decision은 9, i는 8부터 증가.
             8 % 9 == 0 (x)
             9 % 9 == 0 (o) --> if문으로 들어감.

             두번째 나오는 숫자는 9

             */
            if (i % decision == REMAIN) { // 생성된 난수의 배수를 구한다.
                System.out.printf("%d의 배수 i = %d\n", decision, i); // 배수는, i인데..?
                isRandomAllocCheck = false;

                sum += i;
            }
        }

        System.out.println("현재까지 나타난 숫자들의 합 = "+sum);
        /*
        ==결과==
        7의 배수 i = 7
        9의 배수 i = 9
         */
    }
}
