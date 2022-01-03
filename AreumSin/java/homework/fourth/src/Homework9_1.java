public class Homework9_1 {
    public static void main(String[] args) {
        //9. 1 ~ 100까지의 숫자를 순회한다.
        //
        //    2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        //
        //    다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        //
        //    그 다음 루프에서 다시 작업을 반복한다.
        //
        //    끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ?

        final int MAX = 9;
        final int MIN = 2;

        final int START = 1;
        final int END = 100;

        final int NUMBER;

        int sum = 0;

        int range = MAX - MIN +1;

        //100까지 순회한다 -> for을 이용.
        //for (int i = START; i <= END; i++){
            // 100번 순회를 하니 100까지 가기까지 랜덤을 반복해야함.. 그럼.. for문에 넣어야하나...?
            // for 문에 넣으면 100번 반복이 됨..
            // 그럼 합산의 크기를 조건으로 준다.

        int rand;

        for(int i = START; i <= END; i++){
            rand = (int)(Math.random()*range + MIN);

            if(rand == 2) {
                if (i % 2 == 0) {
                    System.out.println("2의 배수: " + i);
                    sum += i;
                }
            }else if(rand == 3) {
                if (i % 3 == 0) {
                    System.out.println("3의 배수: " + i);
                    sum += i;
                }
            }else if(rand == 4) {
                if (i % 4 == 0) {
                    System.out.println("4의 배수: " + i);
                    sum += i;
                }
            }else if(rand == 5) {
                if (i % 5 == 0) {
                    System.out.println("5의 배수: " + i);
                    sum += i;
                }
            }else if(rand == 6) {
                if (i % 6 == 0) {
                    System.out.println("6의 배수: " + i);
                    sum += i;
                }
            }else if(rand == 7) {
                if (i % 7 == 0) {
                    System.out.println("7의 배수: " + i);
                    sum += i;
                }
            }else if(rand == 8) {
                if (i % 8 == 0) {
                    System.out.println("8의 배수: " + i);
                    sum += i;
                }
            }else if(rand == 9) {
                if (i % 9 == 0) {
                    System.out.println("5의 배수: " + i);
                    sum += i;
                }
            }
        }



    }
}
