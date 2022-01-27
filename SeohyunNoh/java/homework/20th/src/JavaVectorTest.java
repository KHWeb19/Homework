import java.util.Vector;

public class JavaVectorTest {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        System.out.println("Vector 생성 직후의 size : "+ v.size());

        v.addElement("자바");
        v.addElement("JPA");
        v.addElement("Vue");
        v.addElement("MySQL");
        v.addElement("TypeScript");

        System.out.println("Vector에 Data값 설정 후 size : " + v.size());

        for(int i = 0; i < v.size(); i++){
            String tmp = v.elementAt(i);
            System.out.println("Vector v의 " + i + "번째 : " + tmp);
        }
    }
}
