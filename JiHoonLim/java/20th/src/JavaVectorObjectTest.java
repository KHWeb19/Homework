import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Vector;

public class JavaVectorObjectTest {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();

        v.addElement(new Character('A'));
        v.addElement(new String("내맘"));
        v.addElement(new Integer(1));
        v.addElement(new BigInteger("123"));
        // 0   1  2   3
        // A  내맘 1  123

        System.out.println("Vector의 크기 :" + v.size());

        v.insertElementAt(new Float(3.141592),1);
        System.out.println("inserElementAt() 이후 크기 : " + v.size());
        // 해당 인덱스 자리에 넣고 기존에 있던 데이터는 뒤로 밀림
        // 0   1    2   3   4
        // A  3.14 내맘  1  123

        v.setElementAt("요런것?",3);
        System.out.println("setElement() 이후 크기 : " + v.size());
        // 해당 인덱스의 값을 바꾼다. (기존의 있던 것이 set한 내용으로 바뀜)
        // 0   1    2    3    4
        // A  3.14 내맘  요런  123

        v.remove(0);
        // 해당 인덱스 제거(빈자리는 그 다음 인덱스가 채운다)
        // 0    1    2    3
        //3.14 내맘  요런  123

        System.out.println("v의 0번째:" +(Float) v.elementAt(0));
        System.out.println("v의 1번째:" +(String) v.elementAt(1));
        System.out.println("v의 2번째:" +(String) v.elementAt(2));
        System.out.println("v의 3번째:" +(BigInteger) v.elementAt(3));

    }
}
