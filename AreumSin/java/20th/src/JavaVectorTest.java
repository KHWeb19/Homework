import java.util.ArrayList;
import java.util.Vector;

public class JavaVectorTest {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        System.out.println("vector 생성 직후의 size: "+v.size());
        
        v.addElement(new String("김카이"));
        v.addElement(new String("김종인"));
        v.addElement(new String("카이"));
        v.addElement(new String("변백현"));
        v.addElement(new String("백현"));
        v.addElement(new String("백현이"));

        System.out.println("vector에 data값 설정 후 size: "+ v.size());

        for(int i = 0; i<v.size(); i++){
            //elementAt(i)는 ArrayList get(i)와 동일.
            String tmp = v.elementAt(i);
            System.out.println("Vector vd의 "+i+"번째: "+ tmp );
        }
    }
}
