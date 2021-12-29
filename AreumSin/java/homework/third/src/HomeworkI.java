public class HomeworkI {
    public static void main(String[] args) {
        //10. 1 ~ 100까지의 숫자를 순회한다.
        // 100번 하라는 말이 아닌가요..?
        //     9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
        //     다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
        //     이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!

        // 나온만큼 이동? -> 나온수만큼 더해라? ->? 근데 더하라가 있는데? 어디로 이동하는건가요...?ㅠ
        // 아..? 2가 나오면 2만큼 이동해서 2를 더하고 거기서 3이 나오면 5로 가서 5를 더해라..?


        int res = 0;
        int num2 =0;

        while(num2 <=100){

            int num1 = (int)(Math.random()*5 +2);

            System.out.println("랜덤 수: "+num1);
            num2 = num1 + res;
            res += num2;

            System.out.println("지금 나는 어느 자리에 있나요?\n>>"+num2);
            System.out.println("합산한 수: "+res);
            System.out.println(" ");

        }

         /*
        for(int i = 0; i<101; i++){

            //int num1 = (int)(Math.random()*9 +2);
            int num1 = (int)(Math.random()*5 +2);

            System.out.println("랜덤 수: "+num1);
            num2 = num1 + res;
            res += num2;

            System.out.println("합산한 수: "+res);
            System.out.println("");


        }

         */
    }
}
