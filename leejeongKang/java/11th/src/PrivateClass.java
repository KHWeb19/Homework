public class PrivateClass {
    private int age;
    private String name;

   /* public void setPersonInfo (int age, String name){
        this.age= age;
        this.name = name;
    }
    메소드 아니면 생성자를 만들어준당 */
    PrivateClass (int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrivateClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
