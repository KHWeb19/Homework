public class P3 {
    // 1,1,1,2,3,4,6,9,13,19,28,41,60,88,129 규칙의 25번째 항

    public static void main(String[] args) {

        int num, num1, num2, num3, count = 1;

        for(num = 1, num1 = 0, num2 = 0, num3 = 0; count <= 25; count++) {
            if(count % 3 == 0){
                num += num1;
                num1 = num;
            }
            else if (count % 3 == 1){
                num += num2;
                num2 = num;
            }
            else{
                num += num3;
                num3 = num;
            }
        }
        System.out.println("규칙의 25번재 항 : " + num);
    }
}
