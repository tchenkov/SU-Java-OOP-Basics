package L08_Polymorphism_Exercises.P01_Vehicles;

public class Truck extends Vehicle {
    private static final double SUMMER_FUEL_CONSUMPTION_INCREASE = 1.6;
    private static final double REFUEL_EFFICIENCY = 95;
    
    public Truck(double fuelQuantity, double fuelConsumptionInLitersPerKm) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm + SUMMER_FUEL_CONSUMPTION_INCREASE);
    }
    
    @Override
    void refuel(double refuelQuantity) {
        super.refuel(refuelQuantity * REFUEL_EFFICIENCY / 100);
    }
}
