public class HomeworkH {
    public static void main(String[] args) {
        //9. 1 ~ 100까지의 숫자를 순회한다.
        //    2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        //    다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        //    그 다음 루프에서 다시 작업을 반복한다.
        //    끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ?

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


    }
}
