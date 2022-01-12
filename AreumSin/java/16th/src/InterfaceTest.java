public class InterfaceTest {
    // 인터페이스가 엔티티 오염을 방지
    public static void main(String[] args) {
        JavaStrcmp js1 = new JavaStrcmp(107.3);
        JavaStrcmp js2 = new JavaStrcmp(33.7);

        if(js1.compareTo(js2)>0){
            System.out.println("js1이 더 크다.");
        }else if(js1.compareTo(js2) < 0){
            System.out.println("js2가 더 크다.");
        }else
            System.out.println("크기가 같다");
    }
}
