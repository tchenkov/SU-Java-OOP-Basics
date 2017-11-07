package L08_Polymorphism_Exercises.P02_VehiclesExtension;

public class Car extends Vehicle {
    static final double SUMMER_FUEL_CONSUMPTION_INCREASE = 0.9;
    
    public Car(double fuelQuantity, double fuelConsumptionInLitersPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm, tankCapacity, SUMMER_FUEL_CONSUMPTION_INCREASE);
    }
    
    
}
