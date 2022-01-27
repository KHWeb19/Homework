public class Homework11 {
    public static void main(String[] args) {

        int MAX =122 , MIN = 65;

        //int ran = (int)(Math.random()*58+65);
        int ran = (int)(Math.random()*(MAX-MIN+1)+MIN);


         //ran의 범위가 정해져있어서 65밑에 숫자와 122위의 숫자는 안 나오는게 아닌가??
        /*
        if(!(90<ran && 97>ran)){

            /System.out.println("ran = " + ran);

        } */
        if(ran>=65 && ran<=90){
            System.out.println("ran = " + ran);
        }else if(ran>=97 && ran<=122){
            System.out.println("ran = " + ran);
        }else{
            System.out.println(ran + "은범위에 해당 되지 않습니다");
        }


    }
}
