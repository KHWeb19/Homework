import java.math.BigInteger;
import java.util.Vector;

public class JavaVectorObjectTest {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();

        v.addElement(new Character('A'));
        v.addElement(new String("내 마음대로"));
        v.addElement(new Integer(77));
        v.addElement(new BigInteger("333"));

        System.out.println("Vector의 크기 : " + v.size());

        // 인덱스 1번에 데이터를 집어넣고 하나씩 밀리도록
        v.insertElementAt(new Float(3.141738), 1);

        //특정인덱스의 데이터만 변경함
        v.setElementAt("이렇게도 됨", 3);
        System.out.println("setElement() 이후 크기 : " + v.size());

    }
}
