public class NonPrivateExampleClass {
    int age;
    String name;

    @Override
    public String toString() {
        return "NonPrivateClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
