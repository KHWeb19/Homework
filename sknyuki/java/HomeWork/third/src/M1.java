public class M1 {
    public static void main(String[] args) {
        final int max= 122;
        final int min= 65;
        int range= (max-min)+1;
        int num=(int)(Math.random()*range+min);

        //아스키코드 소문자와 대문자 라인 => 65~90, 97~122
        boolean upperlLine= 65<=num && num<=90;
        boolean lowerLine= 97<=num && num<=122;

        if(upperlLine||lowerLine){
            System.out.println(num);



        }
    }
}
