public class Three {
    public static void main(String[] args) {

        //주사위는 정수임으로 정수형 변수입력을 하고 랜덤값을 뽑는다
        //두개의 주사위 였으니 변수는 2개
        int a1 = (int)(Math.random() * 6 + 1);
        int a2 = (int)(Math.random() * 6 + 1);

        //첫번째 주사위 값을 출력
        System.out.println("첫번째 주사위 : " + a1);
        //두번째 주사위 값을 출력
        System.out.println("두번째 주사위 : " + a2);
        //나온 주사위 값을 합해서 출력
        System.out.println("두 주사위의 합은 : " + (a1+a2));


        if(a1 % 2 == 0 && a2 % 2 == 0){
            //a1과 a2의 값을 2로 나누었을 때 나머지값이 0이 나오면 짝수임으로  출력
            System.out.println("주사위의 값이 짝수 임으로 당첨 입니다");
        }else
            //a1과 a2의 값을 2로 나누었을 때 나머지 값이 0으로 떨어지지
            // 않으면 홀수임으로 출력
            System.out.println("주사위의 값이 홀수 임으로 손모가지를 내놔라");
    }

}
