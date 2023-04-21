public class Vehicle extends displayFunctions implements VehicleFunctions{
    private String name;
    private int wheels;
    private int doors;
    private String type;
    private int currentGear;
    private int speed;

    public Vehicle() {
    }

    public Vehicle(String name, int wheels, int doors, String type) {
        this.name = name;
        this.wheels = wheels;
        this.doors = doors;
        this.type = type;
        currentGear = 0;
        speed = 0;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public void accelerate(int x){
        this.setSpeed(this.getSpeed()+x);
    }
    @Override
    public void decelerate(int x){
        if(x > this.getSpeed()) this.setSpeed(0);
        else this.setSpeed(this.getSpeed()-x);
    }

    @Override
    public void increaseGear() {
        if(this.getCurrentGear()==6) return;
        this.setCurrentGear(this.getCurrentGear()+1);
    }

    @Override
    public void decreaseGear() {
        if(this.getCurrentGear()==0) return;
        else this.setCurrentGear(this.getCurrentGear()-1);
    }

    @Override
    public void currentGear() {
        System.out.println(getName()+"'s Current gear : "+getCurrentGear());
    }

    @Override
    public void currentSpeed() {
        System.out.println(getName()+"'s Current speed : "+getSpeed());
    }


}
