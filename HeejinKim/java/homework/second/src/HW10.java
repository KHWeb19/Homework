public class HW10 {
    public static void main(String[] args) {



        int min = 65;
        int max = 90;
        int range = max - min + 1;

        int r1 = (int) (Math.random() * (range)) + min;

        System.out.println(r1);

        int min2 = 97;
        int max2 = 122;
        int range2 = max2 - min2 + 1;
        int r2 = (int) (Math.random() * (range2)) + min;

        /*min = 97;
         max = 122;
         range = max - min + 1;
         r2 = (int) (Math.random() * (range2)) + min;*/
        //왜 또다시 int min2를 설정해줘야되는지?
        //이 주석처리된 식으로도 run할 때는 잘 되던데 git에 push가 안됨.
        //range를 초기값 처리도 해봤지만 그 다음 warning이 나오면서 max에 이상이 있다고함.



        System.out.println(r2);


        }


    }

