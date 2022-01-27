import java.util.Vector;

public class VectorPractice2 {
    public static void main(String[] args) {

        Vector<Object> v = new Vector<>();

        v.addElement(new Integer (1));
        v.addElement(new Character('v'));
        v.addElement(new Double(3.33));
        v.addElement(new Float(3.3f));
        v.addElement(new String("야호"));

        System.out.println(v);

        v.insertElementAt(new Integer(3), 1);

        System.out.println(v);

        v.setElementAt(new String("일") , 0);

        System.out.println(v);

        v.remove(1);

        System.out.println(v);
    }
}
