import java.util.Vector;

public class VectorPractice1 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.addElement(new String("잡아"));
        v.addElement(new String("싫어"));
        v.addElement(new String("도랐냐?"));
        v.addElement(new String("아닝"));
        v.addElement(new String("그럼, 잡아"));

        System.out.println(v);
        System.out.println(v.size());

        for(int i = 0; i < v.size(); i++){

            //String tmp = v.elementAt(i);

            System.out.println(v.elementAt(i));
            System.out.println(v.get(i));
        }


    }

}
