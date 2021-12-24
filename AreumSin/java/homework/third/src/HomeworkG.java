public class HomeworkG {
    public static void main(String[] args) {
        //1 ~ 100까지 숫자중 4의 배수를 더한 결과를 출력해보자!
        // 마지막 두자리가 00 이거나, 일의 자리수가 짝수이고 합이 4의 배수
        int res = 0;

        for(int i =1; i<101;  i++){
            if(i % 4 == 0){
                System.out.println("4의 배수: "+i);
                res += i;
            }
        }

        System.out.println(res);

    }
}
