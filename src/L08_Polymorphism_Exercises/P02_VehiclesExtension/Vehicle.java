package L08_Polymorphism_Exercises.P02_VehiclesExtension;

import java.text.DecimalFormat;

public class Vehicle {
    private static final double INITIAL_DISTANCE_TRAVELED = 0;
    
    private double fuelQuantity;
    private double fuelConsumptionInLitersPerKm;
    private double distanceTraveled;
    private double tankCapacity;
    private double acFuelConsumptionIncrease;
    
    public Vehicle(double fuelQuantity, double fuelConsumptionInLitersPerKm, double tankCapacity, double acFuelConsumptionIncrease) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumptionInLitersPerKm(fuelConsumptionInLitersPerKm);
        setDistanceTraveled(INITIAL_DISTANCE_TRAVELED);
        setTankCapacity(tankCapacity);
        this.acFuelConsumptionIncrease = acFuelConsumptionIncrease;
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
    
    private void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
    
    private void addDistanceTraveled(double distance){
        this.distanceTraveled += distance;
    }
    
    void driveWithAC(double distance) {
        this.drive(distance, this.acFuelConsumptionIncrease);
    }
    
    void driveWithoutAC(double distance) {
        this.drive(distance, 0);
    }
    
    private void drive(double distance, double consumptionIncrease) {
        double fuelNeeded = distance * (this.fuelConsumptionInLitersPerKm + consumptionIncrease);
        if (this.fuelQuantity < fuelNeeded) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " needs refueling");
        }
        addDistanceTraveled(distance);
        setFuelQuantity(this.fuelQuantity - fuelNeeded);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(
                String.format("%s travelled %s km",
                        this.getClass().getSimpleName(),
                        df.format(distance)
                )
        );
    }
    
    void refuel(double refuelQuantity) {
        if (refuelQuantity <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.fuelQuantity + refuelQuantity > this.tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        setFuelQuantity(this.fuelQuantity + refuelQuantity);
        
    }
    
    
    @Override
    public String toString() {
        return String.format("%s: %.2f",
                this.getClass().getSimpleName(),
                this.fuelQuantity);
    }
}
