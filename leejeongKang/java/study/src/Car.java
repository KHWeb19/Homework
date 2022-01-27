public class Car {
    String color;
    String gearType;
    int door;

    Car(){
        this("blue", "manual", 6);
    }

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car (String color){
        this(color, "manual", 10);
    }
}


