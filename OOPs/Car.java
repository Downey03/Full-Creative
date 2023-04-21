public class Car extends Vehicle {
    static String type = "CAR";

    public Car() {
        super();
    }

    public Car(String name, int wheels, int doors) {
        super(name, wheels, doors, type);
    }


}
