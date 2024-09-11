package Com.Vehicle.Test;
import Com.Vehicle.Car;
import Com.Vehicle.ElectricCar;

public class Main {

    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(70);  
        c.setFuelLevel(70);  
        System.out.println("TESTING CAR");
        System.out.println(c.getSpeedMph());
        System.out.println(c.getDistancekm());

        System.out.println("TESTING ELECTRIC CAR");
        ElectricCar Ec = new ElectricCar();
        Ec.setBatteryLevel(10);  
        Ec.drive(40); 
        System.out.println(Ec.getBatteryLevel());
        System.out.println(Ec.getBatteryLevel());
    }
}