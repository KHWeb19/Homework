public class PrivateClassEx {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass(20,"강이정");

         /* 이 코드는 클래스 내 변수가 private이므로 컴파일 에러!
        pc.age = 20;
        pc.name = "왜 안될까 ?"; */

        // 그러므로 우리는 매서드나 생성자를 통해서 값을 설정했다.

        //pc.setPersonInfo(20,"우수민");

        System.out.println(pc);
    }
}
