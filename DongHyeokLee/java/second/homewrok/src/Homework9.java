public class Homework9 {
    public static void main(String[] args) {

        final int MAX = 97, MIN =4;
        //값이 변경될 경우 유지보수 용이
        int range = MAX + MIN +1;

        //int ran = (int)(Math.random()*94+4);
        int ran = (int)(Math.random()*range+MIN);

        System.out.println("ran = " + ran);


    }
}
