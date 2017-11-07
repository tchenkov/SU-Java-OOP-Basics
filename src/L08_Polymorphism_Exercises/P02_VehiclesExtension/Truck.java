package L08_Polymorphism_Exercises.P02_VehiclesExtension;

public class Truck extends Vehicle {
    static final double SUMMER_FUEL_CONSUMPTION_INCREASE = 1.6;
    private static final double REFUEL_EFFICIENCY = 95;
    
    public Truck(double fuelQuantity, double fuelConsumptionInLitersPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm, tankCapacity, SUMMER_FUEL_CONSUMPTION_INCREASE);
    }
    
  
    @Override
    void refuel(double refuelQuantity) {
        super.refuel(refuelQuantity * REFUEL_EFFICIENCY / 100);
    }
}
