package L02_DefiningClasses_Exercises.P05_SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPer1Kilometer;
    private int distanceTraveled = 0;
    
    public Car(String model, double fuelAmount, double fuelCostPer1Kilometer) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPer1Kilometer = fuelCostPer1Kilometer;
    }
    
    public void tryToTravel(int distance){
        double fuelNeeded = distance * this.fuelCostPer1Kilometer;
        
        if (fuelNeeded > this.fuelAmount){
            System.out.println("Insufficient fuel for the drive");
            return;
        }
        
        this.distanceTraveled += distance;
        this.fuelAmount -= fuelNeeded;
    }
    
    @Override
    public String toString() {
        return String.format("%s %.2f %d",
                this.model, this.fuelAmount, this.distanceTraveled);
    }
}
