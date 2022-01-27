public class ComparableTest {
    public static void main(String[] args) {
        JavaStrcmp js1 = new JavaStrcmp(123.456);
        JavaStrcmp js2 = new JavaStrcmp(456.789);

        if (js1.compareTo(js2) > 0 ){
            System.out.println("js1 > js2");
        }
        else if ( js1.compareTo(js2)<0){
            System.out.println("js1 < js2");
        }
        else{
            System.out.println("js1 = js2");
        }
    }
}
