public class HW10 {
    public static void main(String[] args) {

        int num = 1;//초기값을 설정
        int sum = 1;
        int ran = (int) ((Math.random()) * 8) + 2;

        while (num <= 100)
        {

            num += ran;
            //num=num+ran
            sum += num;
        }

        System.out.println(sum);

    }
}


