public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("red", "auto", 4);
        Car car2 = new Car();
        Car car3 = new Car("yellow");
        System.out.printf("%s, %s, %d\n", car1.color, car1.gearType, car1.door);
        System.out.printf("%s, %s, %d\n", car2.color, car2.gearType, car2.door);
        System.out.printf("%s, %s, %d\n", car3.color, car3.gearType, car3.door);
    }
}
