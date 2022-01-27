import java.util.ArrayList;

public class ForEachPractice {
    public static void main(String[] args) {


    ArrayList<Integer> a = new ArrayList<>();

    a.add(10);
    a.add(3);
    a.add(7);


    for(Integer t: a){
        System.out.println(t);

    }

    ArrayList<String> b = new ArrayList<>();

    b.add("나는");
    b.add("빡빡이다");

        System.out.println(b);

    for(String t : b){
        System.out.println(t);
    }

    int[] c = new int[3];

    c[0] = 1;
    c[1] = 2;
    c[2] = 3;

    for(int i = 0; i < 3; i++){
        System.out.println(c[i]);
    }


    for(int t : c) {
        System.out.println(t);
    }


    }

}
