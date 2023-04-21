public class Oops {

    public static void main(String[] args) {
        Vehicle audi = new Car("Audi",4,2);
        Bike harley = new Bike("Harley",2,0);

        audi.accelerate(60);
        audi.increaseGear();
        audi.increaseGear();
        audi.decelerate(40);

        audi.currentGear();
        audi.currentSpeed();

        harley.increaseGear();
        harley.increaseGear();
        harley.increaseGear();
        harley.decreaseGear();
        harley.accelerate(79);

        harley.currentGear();
        harley.currentSpeed();

    }
}
