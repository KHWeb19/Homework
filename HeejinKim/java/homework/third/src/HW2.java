public class HW2 {

    public static void main(String[] args) {

        int x,y,z;
         x=1;
         y=1;
         z=2;
        for(int i=3;i<=19;i++){

            x= y;
            y= z;
            z= x+y;

            System.out.println(z);
        }


    }
}
