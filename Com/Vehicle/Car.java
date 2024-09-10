package Com.Vehicle;

public class Car {
    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

    public void setSpeed(double speed){
        speedKph=speed;
    }

    public void setFuelLevel(float fuel){
        fuelLevel=fuel;
    }

    public void drive(int distance){
        distanceTraveled = distance;
    }

    public double getSpeedMph(){
        double speedInMph= speedKph/1.60934;
        return speedInMph;
    }

    public int getDistancekm(){
        return distanceTraveled;
    }

    public int calculateRemainingFuel(double distance){
        double remainingFuel= fuelLevel -(distance *(0.005* fuelLevel ));
        int remainingFuelInteger=(int)remainingFuel;
        return remainingFuelInteger;
    }
}