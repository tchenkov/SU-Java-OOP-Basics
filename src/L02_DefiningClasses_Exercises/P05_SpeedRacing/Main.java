package L02_DefiningClasses_Exercises.P05_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int carsCount = Integer.parseInt(br.readLine());
        Map<String, Car> cars = new LinkedHashMap<>();
        
        getCars(carsCount, cars, br);
        driveCars(cars, br);
        printCarsDistanceTraveled(cars);
        
    }
    
    private static void printCarsDistanceTraveled(Map<String, Car> cars) {
        for (Car car : cars.values()) {
            System.out.println(car);
        }
    }
    
    private static void driveCars(Map<String, Car> cars, BufferedReader br) throws IOException {
        String command = br.readLine();
        while (!command.equals("End")){
            String[] instructions = command.split(" ");
            String instruction = instructions[0];
            
            if (instruction.equals("Drive")){
                String model = instructions[1];
                int distance = Integer.parseInt(instructions[2]);
                cars.get(model).tryToTravel(distance);
            }
    
            command = br.readLine();
        }
    }
    
    private static void getCars(int carsCount, Map<String, Car> cars, BufferedReader br) throws IOException {
        for (int i = 0; i < carsCount; i++) {
            String[] carInfo = br.readLine().split(" ");
            String model = carInfo[0];
            double fuelAmount = Double.parseDouble(carInfo[1]);
            double fuelCostPer1Kilometer = Double.parseDouble(carInfo[2]);
    
            cars.putIfAbsent(model, new Car(model, fuelAmount, fuelCostPer1Kilometer));
        }
    }
}
