public class Test9 {
    public static void main(String[] args) {
        //1 ~ 100까지의 숫자를 순회한다.
        //     //    2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        //    다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        //    그 다음 루프에서 다시 작업을 반복한다.
        //    끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ?


        boolean num1 = true;
        int dec =0;
        int sum = 0;

        for(int i =1; i<=100; i++){
            while (num1){ //boolean이 있을 경우 while문을 돌고 랜덤값이 생겼을 경우 while문은 나와서 if문을 실행하게 된다.
                dec = (int)(Math.random()*9+2); //랜덤값을 저장하는  변수 dec를 선언해서 랜덤값을 저장한다.
                num1=false;
            }

            if(i%dec == 0) {
                System.out.printf("%d의 배수 i = %d\n " , dec, i); //난수의 배수를 선택해서 하나씩 더해주는 것이다.
                num1=true;
                sum += i;
            }

        }
        System.out.println("최종 결과값: " + sum);
    }
}


