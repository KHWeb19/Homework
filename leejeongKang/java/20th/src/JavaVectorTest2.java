import java.math.BigInteger;
import java.util.Vector;

public class JavaVectorTest2 {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();

        v.addElement(new Character('A'));
        v.addElement(new String("ABC"));
        v.addElement(new Integer(56));
        v.addElement(new BigInteger("3333"));
        System.out.printf("vector 의 크기 :%d\n", v.size());

        //insertElementAt()의 역할 : 인덱스 1번에 데이터를 넣고 해당 자리에 있는 데이터를 뒤로 보낸다.
        v.insertElementAt(new Float(3.141592), 1);
        System.out.println("insertElementAt 이후 size "+v.size());

        //setElementAt()의 역할 : 특정 인덱스 데이터값만 변한다.
        v.setElementAt("이런것도 되니?",3);
        System.out.println("setElementAt 이후 size "+v.size());
        System.out.printf("v의 0번째 : %c\n", (Character)v.elementAt(0));
        System.out.printf("v의 1번째 : %f\n", (float)v.elementAt(1));
        System.out.printf("v의 2번째 : %s\n", (String)v.elementAt(2));
        System.out.printf("v의 3번째 : %s\n", (String)v.elementAt(3));
        System.out.printf("v의 4번째 : %d\n", (BigInteger)v.elementAt(4));
        //특정 인덱스의 데이터를 지운다.
        v.remove(0);
    }
}
