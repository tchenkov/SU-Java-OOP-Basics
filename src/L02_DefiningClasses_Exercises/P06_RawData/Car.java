package L02_DefiningClasses_Exercises.P06_RawData;

import java.util.Arrays;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tires = new Tire[4];
    
    public Car(String model, Engine engine, Cargo cargo, Tire[] tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }
    
    public String getModel() {
        return model;
    }
    
    public Cargo getCargo() {
        return cargo;
    }
    
    public Engine getEngine() {
        return engine;
    }
    
    public double getTiresMinPressure() {
        return Arrays.stream(this.tires).mapToDouble(d -> d.getPressure()).min().getAsDouble();
    }
}
