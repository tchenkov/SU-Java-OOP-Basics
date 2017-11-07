package L08_Polymorphism_Exercises.P01_Vehicles;

public class Car extends Vehicle {
    public static final double SUMMER_FUEL_CONSUMPTION_INCREASE = 0.9;
    
    public Car(double fuelQuantity, double fuelConsumptionInLitersPerKm) {
        super(fuelQuantity, fuelConsumptionInLitersPerKm + SUMMER_FUEL_CONSUMPTION_INCREASE);
    }
    
   
}
