
class Vehicle {
    void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive(); 
        car.accelerate(); 
    }
}

    

