package Com.Vehicle.Test;
import Com.Vehicle.Car;
import Com.Vehicle.ElectricCar;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setSpeed(50);  
        c1.setFuelLevel(50);  
        System.out.println("TESTING CAR");
        System.out.println(c1.getSpeedMph());
        System.out.println(c1.getDistancekm());

        System.out.println("TESTING ELECTRIC CAR");
        ElectricCar Ec1 = new ElectricCar();
        Ec1.setBatteryLevel(10);  
        Ec1.drive(50); 
        System.out.println(Ec1.getBatteryLevel());
        System.out.println(Ec1.getBatteryLevel());
    }
}