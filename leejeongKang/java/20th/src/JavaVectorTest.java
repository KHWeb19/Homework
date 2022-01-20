import java.util.Vector;
public class JavaVectorTest {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        System.out.println("Vector size : " + v.size());

        v.addElement(new String("아아"));
        v.addElement(new String("JPA"));
        v.addElement(new String("VUE"));
        v.addElement(new String("MySQL"));
        v.addElement(new String("TypeScript"));
        System.out.println("Vector size 2 :" +v.size());

        for(int i=0; i<v.size(); i++){
            String tmp = v.elementAt(i);
            System.out.println("Vector v의"+ i +"번째 "+tmp);
        }
    }
}
