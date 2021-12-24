public class Hw3 {
    public static void main(String[] args) {
        int thirdPreNum = 1;
        int secondPreNum = 1;
        int preNum = 1;
        int current;

        System.out.println("1번째 항 : " + thirdPreNum);
        System.out.println("2번째 항 : " + secondPreNum);
        System.out.println("3번째 항 : " + preNum);

        for(int i=4 ; i <26 ; i++){
            current = preNum + thirdPreNum;
            System.out.println(i + "번째 항 : " + current);
            thirdPreNum = secondPreNum;
            secondPreNum = preNum;
            preNum = current;
        }
    }
}
