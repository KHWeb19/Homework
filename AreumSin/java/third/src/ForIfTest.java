public class ForIfTest {
    public static void main(String[] args) {

        for(int i = 0; i< 101; i++){
            if(i %2 == 0){
                System.out.println("짝수 : "+i);
            }else
                System.out.println("홀수 : "+i);
        }
    }
}
