package L08_Polymorphism_Exercises.P01_Vehicles;

public class Vehicle {
    private static final double INITIAL_DISTANCE_TRAVELED = 0;
    
    private double fuelQuantity;
    private double fuelConsumptionInLitersPerKm;
    private double distanceTraveled;
    
    public Vehicle(double fuelQuantity, double fuelConsumptionInLitersPerKm) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumptionInLitersPerKm(fuelConsumptionInLitersPerKm);
        setDistanceTraveled(INITIAL_DISTANCE_TRAVELED);
    }
    
    private void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }
    
    private void setFuelConsumptionInLitersPerKm(double fuelConsumptionInLitersPerKm) {
        this.fuelConsumptionInLitersPerKm = fuelConsumptionInLitersPerKm;
    }
    
    private void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }
    
    void drive(double distance){
        double fuelNeeded = distance * this.fuelConsumptionInLitersPerKm;
        if (this.fuelQuantity < fuelNeeded){
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " needs refueling");
        }
        setDistanceTraveled(this.distanceTraveled + distance);
        setFuelQuantity(this.fuelQuantity - fuelNeeded);
    }
    
    void refuel(double refuelQuantity){
        setFuelQuantity(this.fuelQuantity + refuelQuantity);
    }
    
}
