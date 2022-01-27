public class dsdfsf {
    public static void main(String[] args) {

        JavaStrcmp js1 = new JavaStrcmp(100);
        JavaStrcmp js2 = new JavaStrcmp(30);

        if (js1.compareTo(js2) > 0) {
            System.out.println("js1이 js2 보다 더 크다.");
        } else if (js1.compareTo(js2) < 0) {
            System.out.println("js1이 js2 보다 더 작다.");
        } else {
            System.out.println("js1과 js2의 크기는 같다.");
        }
    }

        //오호 이게 빅인티져에선 compareTo 매소드가 있어서 실행이 가능했던거임
        // JavaStrcmp 에는 그걸 구현 한것이고!

    }
}
