import java.util.Vector;

public class JavaVectorObjectTest {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();

        v.addElement(new Character('A'));
        v.addElement(new String("김종인"));
        v.addElement(new Integer(77));
        System.out.println("vector 생성 직후의 size: "+v.size());

        v.insertElementAt(new Float(3.141592), 1);
        System.out.println("vector insertElementAt 후의 size: "+v.size());

        // setElementAt()의 역활은
        // 특정 인덱스의 데이터(값)만 변경된다.
        v.setElementAt("이것도 되나?", 2);

        System.out.println("vector setElementAt 후의 size: "+v.size());

        // System.out.println("v의 0번째: "+ (Object)v.elementAt(0));
        // System.out.println("v의 1번째: "+ (Object)v.elementAt(1));
        // System.out.println("v의 2번째: "+ (Object)v.elementAt(2));
        // System.out.println("v의 3번째: "+ (Object)v.elementAt(3));

        for(int i = 0; i < v.size(); i++){
            System.out.println("v의" +i+"번째: "+v.elementAt(i));
        }

        System.out.println();
        v.remove(0);

        for(int i = 0; i < v.size(); i++){
            System.out.println("v의" +i+"번째: "+v.elementAt(i));
        }
    }
}

