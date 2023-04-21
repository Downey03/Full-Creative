public class Bike extends Vehicle {
    static String type = "BIKE";

    public Bike() {
        super();
    }

    public Bike(String name, int wheels, int doors) {
        super(name, wheels, doors, type);
    }


}
