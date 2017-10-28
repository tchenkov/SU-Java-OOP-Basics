package L02_DefiningClasses_Exercises.P06_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Car> cars = new LinkedList<>();
        
        getCargoCars(cars, br);
    
        String cargoTypeFilterCondition = br.readLine();
        Predicate<Car> cargoFilter = createCarFilter(cargoTypeFilterCondition);
        cars.stream()
                .filter(car -> car.getCargo().getType().equals(cargoTypeFilterCondition))
                .filter(cargoFilter)
                .forEach(car -> System.out.println(car.getModel()));
    }
    
    private static Predicate<Car> createCarFilter(String filterCondition) {
        switch (filterCondition){
            case "fragile":
                return car -> car.getTiresMinPressure() < 1;
            case "flamable":
                return car -> car.getEngine().getPower() > 250;
        }
        return null;
    }
    
    private static void getCargoCars(List<Car> cars, BufferedReader br) throws IOException {
        
        
        int carsCount = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < carsCount; i++) {
            String[] input = br.readLine().split(" ");
            cars.add(getCar(input));
        }
    }
    
    private static Car getCar(String[] input) {
        String model = input[0];
        Engine engine = getEngine(input);
        Cargo cargo = getCargo(input);
        Tire[] tires = getTires(input);
        
        return new Car(model, engine, cargo, tires);
    }
    
    private static Tire[] getTires(String[] input) {
        String[] tiresInput = Arrays.stream(input)
                .skip(5)
                .toArray(String[]::new);
        Tire[] tires = new Tire[tiresInput.length / 2];
        for (int i = 0; i < tiresInput.length; i += 2) {
            double tirePresure = Double.parseDouble(tiresInput[i]);
            int tireAge = Integer.parseInt(tiresInput[i + 1]);
            tires[i / 2] = new Tire(tirePresure, tireAge);
        }
        return tires;
    }
    
    private static Cargo getCargo(String[] input) {
        String[] cargoInfo = Arrays.stream(input)
                .skip(3)
                .limit(2)
                .toArray(String[]::new);
        int cargoWeight = Integer.parseInt(cargoInfo[0]);
        String cargoType = cargoInfo[1];
        return new Cargo(cargoWeight, cargoType);
    }
    
    private static Engine getEngine(String[] input) {
        int[] engineInfo = Arrays.stream(input)
                .skip(1)
                .limit(2)
                .mapToInt(Integer::parseInt)
                .toArray();
        int engineSpeed = engineInfo[0];
        int enginePower = engineInfo[1];
        return new Engine(engineSpeed, enginePower);
    }
}
