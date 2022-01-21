import java.util.HashSet;
import java.util.Set;

public class HashPractice {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();



        String[] duplicate = {"중복" , "노중복" , "중복" , "예스중복"};


        for(String dup : duplicate){

            if(!s.add(dup)){
                System.out.println("중복단어" + dup);
            }else{
                System.out.println(dup);
            }
        }
        System.out.println(s);
    }
}
