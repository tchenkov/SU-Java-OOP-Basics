package L08_Polymorphism_Exercises.P02_VehiclesExtension;

public class Bus extends Vehicle {
    static final double SUMMER_FUEL_CONSUMPTION_INCREASE = 1.4;
    
    
    public Bus(double fuelQuantity, double fuelConsumptionInLitersPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm, tankCapacity, SUMMER_FUEL_CONSUMPTION_INCREASE);
    }
}
