public class Test9 {
    public static void main(String[] args) {
        //1 ~ 100까지의 숫자를 순회한다.
        //     //    2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        //    다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        //    그 다음 루프에서 다시 작업을 반복한다.
        //    끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ?

        int sum = 0;

        for(int i =1; i<=100; i++){
            int num = (int)(Math.random()*9+2);
            System.out.println("선택된 값은" +num +"입니다.");
            int sum2 = 0;
            for(int j =1; j<101; j++){
                if(j% num ==0){
                    System.out.printf("%d " , j);
                    sum2+= j;
                }
            }
            System.out.printf("\n%d회차 결과값: %d\n", i, sum2);
            sum += sum2;
        }
        System.out.println("최종 결과값: " + sum);
    }
}


