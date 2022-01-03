public class Q4 {
    public static void main(String[] args) {


        int i = 1;
        int i2 = 1;
        for (i = 1,i2=1; i < 70; i++) {
            if(i%7==0){
                System.out.println("7x"+(i2++)+"="+i);
            }

        }
    }
}