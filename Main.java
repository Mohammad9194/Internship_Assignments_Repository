abstract class Vehicle {
    abstract void speed();
}

interface Serviceable {
    void service();
}

class Car extends Vehicle implements Serviceable {
    @Override
    void speed() {
        System.out.println("Car speed: 120 km/h");
    }

    @Override
    public void service() {
        System.out.println("Car is being serviced.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.service();
        car.speed();
    }
}
