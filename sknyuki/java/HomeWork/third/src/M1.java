public class M1 {
    public static void main(String[] args) {
      /*  final int max= 122;
        final int min= 65;
        int range= (max-min)+1;
        int num=(int)(Math.random()*range+min);

        //아스키코드 소문자와 대문자 라인 => 65~90, 97~122
        boolean upperlLine= 65<=num && num<=90;
        boolean lowerLine= 97<=num && num<=122;

        if(upperlLine||lowerLine){
            System.out.println(num);
        */

        /*
        범위 지정 122
         */
        final int MAX = 122;
        final int MIN = 65;
        int range = (MAX - MIN) + 1;

        boolean chr = true;
        while (chr) {
            int num = (int) (Math.random() * range + MIN);

            boolean upperlLine = 65 <= num && num <= 90;
            boolean lowerLine = 97 <= num && num <= 122;
            if (upperlLine || lowerLine) {
                System.out.printf("범위 내의 숫자는 %d이다\n", num);
                chr = false;//false로 변환 시켜 루프를 종결 (true인 채면 무한 반복이 되어버림)

            }
        }
    }
}
