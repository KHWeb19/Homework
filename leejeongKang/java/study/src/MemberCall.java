public class MemberCall {
    int iv =10;
    static int cv =20;

    int iv2 = cv;       /// 인스턴스 변수는 클래스 변수를 사용할 수 있다.

    /// static int cv2 = iv;  -> 클래스 변수는 인스턴스 변수를 사용할 수 없다.
    static int cv2 = new MemberCall().iv;

    static void staticMethod() {                //클래스 메소드
        System.out.println(cv);
        //// System.out.println(iv);    -> 클래스 메소드에서 인스턴스 변수는 사용할 수 없다.
        MemberCall membercall = new MemberCall();
        System.out.println(membercall.iv); ///객체 생성 후 인스턴스변수 사용 가능
    }

    void instanceMethod (){
        System.out.println(cv);
        System.out.println(iv);
        System.out.println();
    }


    static void staticMethod2() {
        staticMethod();
        ////// instanceMethod(); -> 클래스 메소드에서 인스턴스 메소드 호출 불가능

        MemberCall memberCall = new MemberCall();
        memberCall.instanceMethod();                ///인스턴스 생성 후 호출 가능
    }

    void instanceMethod2() {                /////인스턴스 메소드엔ㄴ 인스턴스, 클래스 메소드 호출 가능
        staticMethod();
        instanceMethod();
    }


/* 정리
    인스턴스 변수 -> 클래스 변수
    클래스 변수 -> 인스턴스 변수 (x)

    인스턴스 메소드 -> 클래스 변수, 인스턴스 변수
    클래스 메소드 -> 클래스 변수, 인스턴스 변수(x)

    인스턴스 메소드 -> 클래스 메소드, 인스턴스 메소드
    클래스 메소드 -> 클래스 메소드, 인스턴스 메소드 (x)
 */

}
