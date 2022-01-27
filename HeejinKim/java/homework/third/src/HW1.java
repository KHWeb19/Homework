public class HW1 {

    public static void main(String[] args) {


        int ran = (int) ((Math.random()) * 58) + 65;



        while ((ran>=91)&&(ran<=96)){

         ran = (int) ((Math.random()) * 58) + 65;

        }
        System.out.printf("%c",ran);
     }
}
